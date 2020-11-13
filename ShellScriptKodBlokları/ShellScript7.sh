#! /bin/bash

# dosya icerisine metin ekleme
echo -e "Dosyanin ismini giriniz:\c"

read dosyaismi

if [ -f $dosyaismi ] # regular file olup olmadigini kontrol ettik 
then 
	if [ -w $dosyaismi ] # yazilabilir mi diye kontrol ettik
	then
		echo "Dosya Yazilabilir. Ctrl+D ile cikabilirsiniz"
		cat >> $dosyaismi # burasi sayesinde girilen dosyanin icerisine bir yazi yamis olduk
	else
		echo "Dosya yazilabilir degil"
	fi
else
	echo "Dosya mevcut degil"
fi
