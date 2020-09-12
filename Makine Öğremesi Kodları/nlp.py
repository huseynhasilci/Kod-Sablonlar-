# -*- coding: utf-8 -*-


import pandas as pd
import numpy as np
import matplotlib.pyplot as plt


yorumlar = pd.read_csv("Restaurant_Reviews.csv",error_bad_lines=False)

import re 
import nltk




durma = nltk.download("stopwords")

from nltk.stem.porter import PorterStemmer#kelimleri koklerine ayirma
ps = PorterStemmer()
# Preprocessing
derlem = []
from nltk.corpus import stopwords
for i in range(716):
    yorum = re.sub("[^a-zA-Z]"," ",yorumlar["Review"][i])#bunun sayesinde noktlama isaretlerinden ve bosluklardan kurtulmus olduk
    yorum = yorum.lower()
    yorum = yorum.split()
    yorum = [ps.stem(kelime) for kelime in yorum if not kelime in set(stopwords.words("english"))]# stopword mu degil mi ona bakma sekli stemmer ile stem etme sekli

    yorum = " ".join(yorum)
    derlem.append(yorum)
#Feature Extraction Oz nitelik cikarimi
#Bag of words (BOW)
from sklearn.feature_extraction.text import CountVectorizer

cv = CountVectorizer(max_features = 2000)
X = cv.fit_transform(derlem).toarray() #bagimsiz degisken

y = yorumlar.iloc[:,1].values #bagimli degisken
b = np.where(np.isnan(y), 0, y)# nan degerleri 0 a esitleme islemi

# Makine Ogrenmesi
from sklearn.model_selection import train_test_split
X_train,X_test,y_train,y_test = train_test_split(X,b,test_size = 0.20,random_state = 0)

from sklearn.naive_bayes import GaussianNB
gnb = GaussianNB()
gnb.fit(X_train,y_train)

y_pred = gnb.predict(X_test)

from sklearn.metrics import confusion_matrix

cm = confusion_matrix(y_test,y_pred)
print(cm)


