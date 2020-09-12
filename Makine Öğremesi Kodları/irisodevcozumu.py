# -*- coding: utf-8 -*-

import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from sklearn.metrics import confusion_matrix 

veriler = pd.read_excel("Iris.xls")


x = veriler.iloc[:,0:4].values
y = veriler.iloc[:,4:].values

print(x)
print(y)

from sklearn.model_selection import train_test_split
x_train, x_test,y_train,y_test = train_test_split(x,y,test_size=0.33, random_state=0)


from sklearn.preprocessing import StandardScaler

sc = StandardScaler()
X_train = sc.fit_transform(x_train)
X_test = sc.transform(x_test)


from sklearn.linear_model import LogisticRegression

log_r = LogisticRegression(random_state = 0)
log_r.fit(X_train,y_train)


y_pred = log_r.predict(X_test)#tahmin
print(y_pred)
#print(y_test)
lr_cm = confusion_matrix(y_test,y_pred)
print("LR")
print(lr_cm)

#*********************************
from sklearn.neighbors import KNeighborsClassifier

knn = KNeighborsClassifier(n_neighbors=1,metric = "minkowski")

knn.fit(X_train,y_train)

knn_y_pred = knn.predict(X_test)
print(knn_y_pred)
knn_cm = confusion_matrix(y_test,knn_y_pred)
print("KNN")
print(knn_cm)

#*******************************

from sklearn.svm import SVC

svc = SVC(kernel = "linear")
svc.fit(X_train,y_train)

svc_y_pred = svc.predict(X_test)
print(svc_y_pred)

svc_cm = confusion_matrix(y_test,svc_y_pred)
print("SVC")
print(svc_cm)
#****************************************
from sklearn.naive_bayes import  GaussianNB

gnb = GaussianNB()
gnb.fit(X_train,y_train)

gnb_y_pred = gnb.predict(X_test)

print(gnb_y_pred)

gnb_cm = confusion_matrix(y_test,gnb_y_pred)
print("NB")
print(gnb_cm)
#*****************************************
from sklearn.tree import DecisionTreeClassifier
dtc = DecisionTreeClassifier(criterion = "entropy")
dtc.fit(X_train,y_train)

dtc_y_pred = dtc.predict(X_test)
print(dtc_y_pred)

dtc_cm = confusion_matrix(y_test, dtc_y_pred)
print("DT")
print(dtc_cm)


from sklearn.ensemble import RandomForestClassifier

rfc = RandomForestClassifier(n_estimators = 10 ,criterion = "entropy")
rfc.fit(X_train,y_train)

rfc_y_pred = rfc.predict(X_test)

print(rfc_y_pred)

rfc_cm = confusion_matrix(y_test,rfc_y_pred)
print("RF")
print(rfc_cm)


rfc_y_proba = rfc.predict_proba(X_test)

from sklearn import metrics
fpr,tpr,thold = metrics.roc_curve(y_test,rfc_y_proba[:,0],pos_label = "Iris-versicolor")
print(fpr)
print(tpr)
print(thold)






