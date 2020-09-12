# -*- coding: utf-8 -*-
import numpy as np
import matplotlib.pyplot as plt 
import pandas as pd 

veriler = pd.read_csv("Wine.csv")

X = veriler.iloc[:,0:13].values
y = veriler.iloc[:,13].values

from sklearn.model_selection import train_test_split
X_train,X_test,y_train,y_test = train_test_split(X,y,test_size = 0.2,random_state = 0)


from  sklearn.preprocessing import StandardScaler

sc = StandardScaler()

X_train = sc.fit_transform(X_train)
X_test = sc.fit_transform(X_test)

#PCA


from sklearn.decomposition import PCA
pca = PCA(n_components = 2)

X_train2 = pca.fit_transform(X_train)
X_test2 = pca.transform(X_test)


#pca donusumundan once gelen LR
from sklearn.linear_model import LogisticRegression

classsifer = LogisticRegression(random_state = 0)
classsifer.fit(X_train,y_train)


#pca donusumundan sonra gelen LR
classsifer2 = LogisticRegression(random_state = 0)
classsifer2.fit(X_train2,y_train)

#tahminler
y_pred = classsifer.predict(X_test)

y_pred2 = classsifer2.predict(X_test2)

from sklearn.metrics import confusion_matrix
# actual / pca olmadan cikan sonuc 
print("Gercek ve pca olmadan")
cm = confusion_matrix(y_test, y_pred)
print(cm)
# actual / pca sonrasi cikan sonuc 
print("Gercek ve pca sonrasi")
cm2= confusion_matrix(y_test, y_pred2)
print(cm2)

# PCA sonrasi / pca oncesi
print("pca sonrasi ve oncesi")
cm3= confusion_matrix(y_pred, y_pred2)
print(cm3)
#LDA
from sklearn.discriminant_analysis import LinearDiscriminantAnalysis as LDA
lda = LDA(n_components = 2)


X_train_lda = lda.fit_transform(X_train,y_train)
X_test_lda = lda.transform(X_test)

#LDA donusumundan sonra
classsifer_lda = LogisticRegression(random_state = 0)
classsifer_lda.fit(X_train_lda,y_train)

y_pred_lda = classsifer_lda.predict(X_test_lda)

#LDA sonrasi ve orjinal veri
cm4 = confusion_matrix(y_test,y_pred_lda)
print("LDA sonrasi ve orjinal veri")
print(cm4)
#LDA sonrasi ve PCA verisi
cm4 = confusion_matrix(y_pred,y_pred_lda)
print("LDA sonrasi ve PCA verisi")
print(cm4)









