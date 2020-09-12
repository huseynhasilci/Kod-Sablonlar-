# -*- coding: utf-8 -*-

import numpy as np
import matplotlib.pyplot as plt 
import pandas as pd 

veriler = pd.read_csv("Social_Network_Ads.csv")

X = veriler.iloc[:,[2,3]].values
y = veriler.iloc[:,4].values

from sklearn.model_selection import train_test_split
X_train,X_test,y_train,y_test = train_test_split(X,y,test_size = 0.2,random_state = 0)

from  sklearn.preprocessing import StandardScaler

sc = StandardScaler()

X_train = sc.fit_transform(X_train)
X_test = sc.fit_transform(X_test)

from sklearn.svm import SVC

classifier = SVC(kernel = "rbf",random_state = 0)
classifier.fit(X_train,y_train)

y_pred = classifier.predict(X_test)

from sklearn.metrics import confusion_matrix

cm = confusion_matrix(y_test,y_pred)

print(cm)
# k-katlamali capraz dogrulama
from sklearn.model_selection import cross_val_score
# 1. estimator : classifier(bizim durum) 
# 2. X
# 3. Y
# 4. cv : kac katlamali
basari = cross_val_score(estimator = classifier,X = X_train,y = y_train,cv = 4)
print(basari.mean())
print(basari.std())


# parametre optimizasyon
from sklearn.model_selection import GridSearchCV # croos validation ozelliklerini de tasiyor
# istedigimiz kadar parametreleri buraya yazabiliriz 
#ctrl I yapar isek uzerinde calismak istedigimiz svc gibi linear regression gibi knn gibi algoritmalarin icerisindeki parametlere ulasip istedigimiz degerleri deneme sansini yakalamis olururz
p = [{"C":[1,2,3,4,5],"kernel":["linear"]},
      {"C":[1,10,100,1000],"kernel":["rbf"],
       "gamma":[1,0.5,0.1,0.01,0.001]}]

"""
GS parametlereleri
estimator : sınıflandırma algoritması (neyi optimize etmek istediğimiz)
param_grid : parametreler/ denenecekler (p)
scoring : neye göre skorlanacak : örn: accuracy
cv = kaç katlamalı olacağı
n_jobs : aynı anda çalışacak iş 

"""

gs = GridSearchCV(estimator = classifier, #SVM algoritmasi
                 param_grid = p,
                 scoring = "accuracy",
                 cv = 10,
                 n_jobs = -1)

grid_search = gs.fit(X_train,y_train)

eniyisonuc = grid_search.best_score_

eniyiparametreler = grid_search.best_params_

print(eniyisonuc)
print(eniyiparametreler)






















