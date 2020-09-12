# -*- coding: utf-8 -*-
"""
Created on Fri Jun 12 16:29:44 2020

@author: huseyin
"""

import numpy as np
import pandas as pd
import matplotlib.pyplot as plt


# veri yukleme 
veriler = pd.read_csv("veriler.csv")

# veri on isleme 
boy  = veriler[["boy"]]
#print(boy)

boy_kilo =veriler[["boy","kilo"]]

#print(boy_kilo)

class Insan:
    boy = 180
    def kosmak(self,b):
        return int(b)+10
    
ali = Insan() 
#print(ali.boy)
#print(ali.kosmak(90))


#eksik veriler
eksik_veriler= pd.read_csv("eksikveriler.csv") 

print(eksik_veriler)
from sklearn.preprocessing import Imputer

imputer = Imputer(missing_values = "NaN",strategy = "mean",axis = 0)

yas = eksik_veriler.iloc[:,1:4].values
print(yas)
imputer = imputer.fit(yas[:,1:4])
yas[:,1:4] = imputer.transform(yas[:,1:4])
print(yas)

ulke = eksik_veriler.iloc[:,0:1].values
print(ulke)
from sklearn.preprocessing import LabelEncoder

le = LabelEncoder()
ulke[:,0] = le.fit_transform(ulke[:,0])
print(ulke)
from sklearn.preprocessing import OneHotEncoder

ohe = OneHotEncoder(categorical_features = "all")
ulke = ohe.fit_transform(ulke).toarray()
print(ulke)

sonuc = pd.DataFrame(data= ulke,index = range(22),columns = ["fr","tr","us"])

print(sonuc)

sonuc2 = pd.DataFrame(data = yas,index = range(22),columns = ["boy","kilo","yas"])
print(sonuc2)

cinsiyet = eksik_veriler.iloc[:,-1].values
print(cinsiyet)

sonuc3 = pd.DataFrame(data = cinsiyet,index = range(22),columns= ["cinsiyet"] ) 
print(sonuc3)


s = pd.concat([sonuc,sonuc2],axis = 1)# data frameleri birlestirmeye yariyor
print(s)

s2 = pd.concat([s,sonuc3],axis= 1)
print(s2)


from sklearn.model_selection import train_test_split

x_train, x_test, y_train, y_test = train_test_split(s,sonuc3,test_size = 0.33,random_state = 0)

from sklearn.preprocessing import StandardScaler

sc = StandardScaler()

X_train = sc.fit_transform(x_train)
X_test = sc.fit_transform(x_test)































