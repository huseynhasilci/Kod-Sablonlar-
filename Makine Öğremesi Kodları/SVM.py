

#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Mar 15 04:18:20 2018

@author: sadievrenseker
"""

#1. kutuphaneler
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

#2. Veri Onisleme

#2.1. Veri Yukleme
veriler = pd.read_csv('veriler.csv')
#pd.read_csv("veriler.csv")

x = veriler.iloc[:,1:4].values #bagimsiz degiskenler
y = veriler.iloc[:,4:].values #bagimli degisken
print(y)
#verilerin egitim ve test icin bolunmesi
from sklearn.model_selection import train_test_split
x_train, x_test,y_train,y_test = train_test_split(x,y,test_size=0.33, random_state=0)

#verilerin olceklenmesi
from sklearn.preprocessing import StandardScaler

sc = StandardScaler()
X_train = sc.fit_transform(x_train)
X_test = sc.transform(x_test)


from sklearn.linear_model import LogisticRegression

log_r = LogisticRegression(random_state = 0)
log_r.fit(X_train,y_train)


y_pred = log_r.predict(X_test)
print(y_pred)
print(y_test)


# burada ne kadar dogru sekilde calistigina bakmak icin bir islem yapabilmek adina confusion_matrixi kullandik
from sklearn.metrics import confusion_matrix 
cm = confusion_matrix(y_test,y_pred)
print(cm)
# ---------------------KNN-------------------
from sklearn.neighbors import KNeighborsClassifier

knn = KNeighborsClassifier(n_neighbors=1,metric = "minkowski")

knn.fit(X_train,y_train)

knn_y_pred1 = knn.predict(X_test) 
print(knn_y_pred1)
cm1 = confusion_matrix(y_test,knn_y_pred1)
print(cm1)

# ----------------------------------SVM---------------------------
from sklearn.svm import SVC
svc = SVC(kernel = "linear")
svc.fit(X_train,y_train)
svc_y_pred = svc.predict(X_test)
print("--------SVC----------")
print(svc_y_pred)
svc_cm = confusion_matrix(y_test,svc_y_pred)
print(svc_cm)














