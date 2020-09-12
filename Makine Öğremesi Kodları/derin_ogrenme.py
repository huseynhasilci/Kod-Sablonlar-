# -*- coding: utf-8 -*-



import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

#2. Veri Onisleme

#2.1. Veri Yukleme
veriler = pd.read_csv('Churn_Modelling.csv')
#pd.read_csv("veriler.csv")


#veri on isleme
X = veriler.iloc[:,3:13].values
Y = veriler.iloc[:,13].values

from sklearn.preprocessing import LabelEncoder
le = LabelEncoder()
X[:,1] = le.fit_transform(X[:,1])

le2 = LabelEncoder()
X[:,2] = le2.fit_transform(X[:,2])

#print(X)

from sklearn.preprocessing import OneHotEncoder
ohe = OneHotEncoder(categorical_features=[1])
X=ohe.fit_transform(X).toarray()
X = X[:,1:]

#numpy dizileri dataframe donusumu


#verilerin egitim ve test icin bolunmesi
from sklearn.model_selection import train_test_split
x_train, x_test,y_train,y_test = train_test_split(X,Y,test_size=0.33, random_state=0)

#verilerin olceklenmesi
from sklearn.preprocessing import StandardScaler

sc = StandardScaler()
X_train = sc.fit_transform(x_train)
X_test = sc.fit_transform(x_test)

#3 Yapay sinir agi 

import keras 
from keras.models import Sequential #https://keras.io/guides/sequential_model/    https://keras.io/api/models/sequential/#sequential-class
from keras.layers import Dense #https://keras.io/api/layers/core_layers/dense/

classifier = Sequential()
classifier.add(Dense(units = 6,init = "uniform",activation = "relu",input_dim = 11)) #input_dim bizim X degerindeki sutun sayisi ayrica burasi bir giris katmani
#keras gizli katman ekleme
classifier.add(Dense(units = 6,init = "uniform",activation = "relu"))# gizli katman oldugu icin bir input almaz cunkü katmanin devamidir.

classifier.add(Dense(units = 1,init = "uniform",activation = "sigmoid"))

classifier.compile(optimizer = "adam",loss = "binary_crossentropy",metrics= ["accuracy"])

classifier.fit(X_train,y_train,epochs = 50)# x'den y yi ogren epoch kac defa ogreneceginin degeri kac defa uzerinden islem yapilacaginin degeri

y_pred = classifier.predict(X_test)

y_pred = (y_pred > 0.5)
from sklearn.metrics import confusion_matrix
cm = confusion_matrix(y_test,y_pred)

print(cm)


























