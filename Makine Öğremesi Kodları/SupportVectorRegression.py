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



#2.1. Veri Yukleme
veriler = pd.read_csv('maaslar.csv')

#data frame dilimleme (slice)
x = veriler.iloc[:,1:2]
y = veriler.iloc[:,2:]
#numpy array donusumu
X = x.values 
Y = y.values 
#linear regression
#dogrusal model olusturma
from sklearn.linear_model import LinearRegression

lin_reg = LinearRegression()
lin_reg.fit(x,y)

#plt.scatter(x,y,color = "red")
#plt.plot(x,lin_reg.predict(x),color = "blue")
#plt.show()

#polynomial regression
# dogrusal olmayan (nonlinear model) olusturma
#ikinci dereceden denenmis kismi (polinom)
from sklearn.preprocessing import PolynomialFeatures

poly_reg = PolynomialFeatures(degree = 2) 
x_poly = poly_reg.fit_transform(x)

lin_reg2 = LinearRegression()
lin_reg2.fit(x_poly,y)



#polynomial regression
# dogrusal olmayan (nonlinear model) olusturma
#dorduncu dereceden denenmis kismi (polinom)


poly_reg3 = PolynomialFeatures(degree = 4) 
x_poly3 = poly_reg3.fit_transform(x)

lin_reg3 = LinearRegression()
lin_reg3.fit(x_poly3,y)
# gorsellestirme
#plt.scatter(x,y,color = "red")
#plt.plot(x,lin_reg.predict(x),color = "blue")
#plt.show()

#plt.scatter(x,y,color = "red")
#plt.plot(x,lin_reg2.predict(poly_reg.fit_transform(x)),color = "blue")
#plt.show()

#plt.scatter(x,y,color = "red")
#plt.plot(x,lin_reg3.predict(poly_reg3.fit_transform(x)),color = "blue")
#plt.show()

#tahminler ayrica farkli tahminler

print(lin_reg.predict(np.array([11]).reshape(1, 1)))

print(lin_reg.predict(np.array([6.6]).reshape(1, 1)))

print(lin_reg2.predict(poly_reg.fit_transform(np.array([11]).reshape(1,1))))
print(lin_reg2.predict(poly_reg.fit_transform(np.array([6.6]).reshape(1,1))))


from sklearn.preprocessing import StandardScaler

sc = StandardScaler()
x_olcekli = sc.fit_transform(X)
sc2 = StandardScaler()
y_olcekli = sc2.fit_transform(Y)

from sklearn.svm import SVR

svr_reg = SVR(kernel = "rbf")
svr_reg.fit(x_olcekli,y_olcekli)

plt.scatter(x_olcekli,y_olcekli,color = "red")
plt.plot(x_olcekli,svr_reg.predict(x_olcekli),color = "blue")

print(svr_reg.predict(np.array([11]).reshape(1, 1)))
print(svr_reg.predict(np.array([6.6]).reshape(1, 1)))
































