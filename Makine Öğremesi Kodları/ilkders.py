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