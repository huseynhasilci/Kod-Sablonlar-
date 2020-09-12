# -*- coding: utf-8 -*-
"""
Created on Fri Jun 12 16:29:44 2020

@author: huseyin
"""

import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

#2-) veri on isleme 
#2.1-) veri yukleme 
veriler = pd.read_csv("veriler.csv")





#encoder  Kategorik(Nominal Ordinal) --> Numeric
ulke = veriler.iloc[:,0:1].values
print(ulke)
from sklearn.preprocessing import LabelEncoder

le = LabelEncoder()
ulke[:,0] = le.fit_transform(ulke[:,0])
print(ulke)
#Onehot encoder amaci column basliklarini etiketleri tasimak her etikete 1 veya 0 diyerek oraya ait ya da degilk demektir
from sklearn.preprocessing import OneHotEncoder

ohe = OneHotEncoder(categorical_features = "all")
ulke = ohe.fit_transform(ulke).toarray()
print(ulke)

c = veriler.iloc[:,-1:].values
print(c)
from sklearn.preprocessing import LabelEncoder

le = LabelEncoder()
c[:,0] = le.fit_transform(c[:,0])
print(c)
#Onehot encoder amaci column basliklarini etiketleri tasimak her etikete 1 veya 0 diyerek oraya ait ya da degilk demektir
from sklearn.preprocessing import OneHotEncoder

ohe = OneHotEncoder(categorical_features = "all")
c = ohe.fit_transform(c).toarray()
print(c)



#numpy dizileri dataframe donusumu
sonuc = pd.DataFrame(data= ulke,index = range(22),columns = ["fr","tr","us"])

print(sonuc)

sonuc2 = pd.DataFrame(data = yas,index = range(22),columns = ["boy","kilo","yas"])
print(sonuc2)

cinsiyet = veriler.iloc[:,-1].values
print(cinsiyet)

sonuc3 = pd.DataFrame(data = c[:,:1],index = range(22),columns= ["cinsiyet"] ) 
print(sonuc3)

#concat ile dataframeleri birlesitiriyoruz
s = pd.concat([sonuc,sonuc2],axis = 1)# data frameleri birlestirmeye yariyor
print(s)

s2 = pd.concat([s,sonuc3],axis= 1)
print(s2)

#verileri egitim ve test icin bolunmesi
from sklearn.model_selection import train_test_split

x_train, x_test, y_train, y_test = train_test_split(s,sonuc3,test_size = 0.33,random_state = 0)
# verilerin olceklenmesi
from sklearn.preprocessing import StandardScaler

#sc = StandardScaler()

#X_train = sc.fit_transform(x_train) # bir scale olusturuyoruz
#X_test = sc.fit_transform(x_test)# farkli dunyalardaki verilerin ayni dunyaya isledik bunun sayesinde 

from sklearn.linear_model import LinearRegression

regressor = LinearRegression()

regressor.fit(x_train,y_train)

y_pred = regressor.predict(x_test)

boy = s2.iloc[:,3:4].values
print(boy)

sol = s2.iloc[:,:3]

sag = s2.iloc[:,4:]

veri = pd.concat([sol,sag],axis = 1)

x_train, x_test, y_train, y_test = train_test_split(veri,boy,test_size = 0.33,random_state = 0)

r2 = LinearRegression()

r2.fit(x_train,y_train)

y_pred1 = r2.predict(x_test) 

import statsmodels.api as sm

X = np.append(arr = np.ones((22,1)).astype(int),values = veri,axis = 1)
X_l = veri.iloc[:,[0,1,2,3,5]].values
r_ols = sm.OLS(endog = boy, exog = X_l)
r = r_ols.fit()
print(r.summary())



























