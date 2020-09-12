from flask import Flask,request,render_template,flash,redirect,url_for,session,logging
from flask_mysqldb import MySQL
from wtforms import Form,StringField,TextAreaField,PasswordField,validators
from passlib.hash import sha256_crypt
from functools import wraps
# kullanici giris decoratoru
def login_required(f):
    @wraps(f)
    def decorated_function(*args, **kwargs):
        if "logged_in" in session:

            return f(*args, **kwargs)
        else:
            flash("Bu sayfayı görüntülemek için lütfen giriş yapınız.","danger")
            return redirect(url_for("login"))
    return decorated_function

class RegisterForm(Form):
    name = StringField("İsim Soyisim",validators= [validators.Length(min = 4,max = 25)])
    username = StringField("Kullanıcı Adı",validators= [validators.Length(min = 5,max = 35)])
    email = StringField("E-Mail Adresi",validators= [validators.Email(message="Lütfne geçerli bir e-mail adresi giriniz.")])
    password = PasswordField("Şifre:",validators = [validators.DataRequired("Lütfen bir parola belirleyiniz."),validators.EqualTo(fieldname="confirmPassword",message="Parolanız Uyuşmamaktadır")])
    confirmPassword = PasswordField("Şifreyi Doğrula:")
class LoginForm(Form):
    username = StringField("Kullanıcı Adı")
    password = PasswordField("Parola")
class Article(Form):
    title = StringField("Makale Başlığı",validators = [validators.Length(min = 5,max = 100)])

    content = TextAreaField("Makale İçeriği",validators= [validators.Length(min=10)])
    
app = Flask(__name__)
app.secret_key = "ybblog"
app.config["MYSQL_HOST"] = "localhost"
app.config["MYSQL_USER"] = "root"
app.config["MYSQL_PASSWORD"] = ""
app.config["MYSQL_DB"] = "ybblog"
app.config["MYSQL_CURSORCLASS"] = "DictCursor"


mysql = MySQL(app)

@app.route("/")
def index():
    numbers1 = [
            {"id":1,"title":"Deneme1","context":"Deneme1 Icerik"},
            {"id":2,"title":"Deneme2","context":"Deneme2 Icerik"},
            {"id":3,"title":"Deneme3","context":"Deneme3 Icerik"}


    ]
    




    
    return render_template("index.html",numbers = numbers1)

@app.route("/about")
def about():
    return render_template("about.html")


@app.route("/register",methods = ["GET","POST"])
def register():
    form = RegisterForm(request.form)
    if request.method == "POST" and form.validate():
        name = form.name.data
        username = form.username.data
        email = form.email.data
        password = sha256_crypt.encrypt(form.password.data)

        cursor = mysql.connection.cursor()

        sorgu_username = "Select * from users where username = %s"
        result = cursor.execute(sorgu_username,(username,))

        if result > 0:
            flash("Bu Kullanıcı Adı Bulunmaktadır. Lütfen Başka Bir Kullanıcı Adı Girin...","warning")
            return redirect(url_for("register"))
        else:
            sorgu = "Insert into users(name,email,username,password) VALUES(%s,%s,%s,%s)"

            cursor.execute(sorgu,(name,email,username,password))
            mysql.connection.commit()

            cursor.close()
            #redirect işleminden hemen önce flash message'i kullanarak kullanıcıya feedback veriyoruz.
            #messages.html yardımıyla yapıyoruz.
            flash("Başarıyla Kayıt Oldunuz...","success")

        return redirect(url_for("login"))
    else:
        return render_template("register.html",form = form)
@app.route("/login",methods = ["GET","POST"])
def login():
    form = LoginForm(request.form)
    if request.method == "POST":
        username = form.username.data
        password = form.password.data
        cursor = mysql.connection.cursor()
        sorgu = "SELECT * FROM users WHERE username = %s"
        result = cursor.execute(sorgu,(username,))

        if result > 0:
            data = cursor.fetchone()
            real_password = data["password"]
            if sha256_crypt.verify(password,real_password):
                flash("Başarıyla giriş yaptınız","success")
                session["logged_in"] = True
                session["username"] = username
                return redirect(url_for("index"))
            else:
                flash("Yanlış parola girdiniz lütfen tekrar deneyiniz","danger")
                return redirect(url_for("login"))

        else:
            flash("Böyle bir kullanıcı adı bulunmamaktadır","danger")
            return redirect(url_for("login"))


    else:
        return render_template("login.html",form = form)

@app.route("/logout")
def logout():
    session.clear()
    return redirect(url_for("index"))

@app.route("/dashboard")
@login_required
def dashboard():
    
    cursor = mysql.connection.cursor()

    sorgu = "Select * From articles where author = %s"

    result = cursor.execute(sorgu,(session["username"],))

    if result > 0:
        articles = cursor.fetchall()
        return render_template("dashboard.html",articles = articles)

    else:
        return render_template("dashboard.html")

    return render_template("dashboard.html")
#makale ekleme
@app.route("/addarticle",methods = ["GET","POST"])
def addarticle():
    form  = Article(request.form)
    if request.method == "POST" and form.validate():
        title = form.title.data
        content = form.content.data
        cursor = mysql.connection.cursor()
        sorgu = "Insert into articles(title,author,content) VALUES(%s,%s,%s)"

        cursor.execute(sorgu,(title,session["username"],content))

        mysql.connection.commit()
        
        cursor.close()

        flash("Makale başarıyla oluşturuldu","success")
        return redirect(url_for("dashboard"))

    else:
    
        return render_template("addarticle.html",form = form)


#Makale Sayfası
@app.route("/articles")
def articles():
    cursor = mysql.connection.cursor()
    
    sorgu = "Select * From articles"

    result = cursor.execute(sorgu)

    if result > 0:
        
        articles = cursor.fetchall()
        
        return render_template("articles.html",articles = articles)
    else:
        return render_template("article.html")


@app.route("/article/<string:id>")
def article(id):
    cursor = mysql.connection.cursor()
    
    sorgu = "Select * from articles where id = %s"

    result = cursor.execute(sorgu,(id,))

    if result > 0:
        article = cursor.fetchone()
        return render_template("article.html", article = article)
    else:
        return render_template("article.html")

#makale silme
@app.route("/delete/<string:id>")
@login_required
def delete(id):
    cursor = mysql.connection.cursor()

    sorgu = "Select * from articles where author = %s and id = %s"

    result = cursor.execute(sorgu,(session["username"],id))

    if result >0:
        sorgu2 = "Delete from articles where id = %s"
        cursor.execute(sorgu2,(id,))
        mysql.connection.commit()
        return redirect(url_for("dashboard"))


    else:
        flash("Böyle bir makale yok veya böyle bir makaleyi silmeye yetkiniz yok","danger")
        return redirect(url_for("index"))

#makale güncelleme
@app.route("/edit/<string:id>",methods = ["GET","POST"])
def update(id):

    if request.method == "GET":
        cursor = mysql.connection.cursor()

        sorgu = "Select * from articles where id = %s and author = %s"

        result = cursor.execute(sorgu,(id,session["username"]))

        if result == 0:
            flash("Bölye bir makale yok veya bu işleme yetkiniz yok","danger")
            return redirect(url_for("index"))  
        else:
            article = cursor.fetchone()
            form = Article()
            form.title.data = article["title"]
            form.content.data = article["content"]
            return render_template("update.html",form = form)


    else:
        # post request
        form = Article(request.form)

        newTitle = form.title.data
        newContent = form.content.data

        sorgu2 = "Update articles Set title = %s,content = %s where id = %s"

        cursor = mysql.connection.cursor()
        cursor.execute(sorgu2,(newTitle,newContent,id))

        mysql.connection.commit()

        flash("Makale Başarıyla Güncellendi","succes")

        return redirect(url_for("dashboard"))

#Arama Url
@app.route("/search",methods = ["GET","POST"])
def search():
    if request.method == "GET":
        return redirect(url_for("index"))

    else:
        keyword = request.form.get("keyword")
        cursor = mysql.connection.cursor()
        sorgu = "Select * from articles where title like '%" + keyword +"%' "
        
        result = cursor.execute(sorgu)

        if result == 0:
            flash("Aranan kelimeye uygun makale bulunamadı","danger")
            return redirect(url_for("articles"))
        else:
            articles = cursor.fetchall()
            return render_template("articles.html",articles = articles)





if __name__ == "__main__":
    app.run(debug=True)











