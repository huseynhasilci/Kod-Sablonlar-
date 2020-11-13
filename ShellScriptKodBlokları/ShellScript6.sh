#! /bin/bash

# dosya dogrulama operatorleri

echo -e"Dosyanin ismini giriniz:\c"

read dosyaismi

if [ -e $dosyaismi ] # burada dosya ismi mevcut mu diye kontrol ettik
then
	echo "$dosyaismi bulundu" 
else
	echo "$dosyaismi bulunamadi"
fi			# -e dosya mevcut demek
			# -f dosya mevcut ve regular file
			# -s dosya icerigi dolu
			# -d klasor olup olmadigi
			# -r read olup olmadigi
			# -w write olup olmadigi
			# -x executable olup olmadigi
if [ -s $dosyaismi ] # burada dosya icerigi mevcut mu diye kontrol ettik
then
	echo "$dosyaismi doludur" 
else
	echo "$dosyaismi dolu degildir"
fi			

if [ -w $dosyaismi ] # burada dosya icerigi yazilabilir mi diye kontrol ettik
then
	echo "$dosyaismi yazilabilir" 
else
	echo "$dosyaismi yazilabilir degildir"
fi			
			

