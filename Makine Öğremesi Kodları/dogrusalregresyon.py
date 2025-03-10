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

veriler= pd.read_csv("satislar.csv") 
print(veriler)
aylar = veriler[["Aylar"]]
print(aylar)
satislar = veriler[["Satislar"]]
print(satislar)


#verileri egitim ve test icin bolunmesi
from sklearn.model_selection import train_test_split

x_train, x_test, y_train, y_test = train_test_split(aylar,satislar,test_size = 0.33,random_state = 0)
"""
# verilerin olceklenmesi
from sklearn.preprocessing import StandardScaler

sc = StandardScaler()

X_train = sc.fit_transform(x_train) # bir scale olusturuyoruz
X_test = sc.fit_transform(x_test)# farkli dunyalardaki verilerin ayni dunyaya isledik bunun sayesinde 
Y_train = sc.fit_transform(y_train)
Y_test = sc.fit_transform(y_test)
"""
# model insasi (linear regression)

from sklearn.linear_model import LinearRegression

lr = LinearRegression()

lr.fit(x_train,y_train)


tahmin = lr.predict(x_test)

x_train = x_train.sort_index()
y_train = y_train.sort_index()

plt.plot(x_train,y_train)

plt.plot(x_test,lr.predict(x_test))

plt.title("Aylara Göre Satış")
plt.xlabel("Aylar")
plt.ylabel("Satışlar")
















