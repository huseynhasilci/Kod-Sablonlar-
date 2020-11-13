#! /bin/bash

#case statements

arac=$1 # acilan scriptin yanina ne yazilirsa arac degeri o olacak 

case $arac in
	"araba" ) # bu sekilde araba condiitonu yaptik
	echo "$arac 200Tl'ye gunluk kiralanir";;
	"Motorsiklet" )
	echo "$arac 100 TL'ye gunluk kiralanabilir";;
	"Bisiklet" )
	echo "$arac 50 tlye kiralanir";;
	* )
	echo "$arac kiralik degildir" # burasi bunlarin disindakiler demek oluyor
esac

echo -e "Bir arac giriniz:\c"

read arac1 # bu sekilde de kullanicidan deger alinabilir

case $arac1 in
	"araba" ) # bu sekilde araba condiitonu yaptik
	echo "$arac1 200Tl'ye gunluk kiralanir";;
	"Motorsiklet" )
	echo "$arac1 100 TL'ye gunluk kiralanabilir";;
	"Bisiklet" )
	echo "$arac1 50 tlye kiralanir";;
	* ) # burasi else kismi gibi dusunulebilir
	echo "$arac1 kiralik degildir" # burasi bunlarin disindakiler demek oluyor
esac


echo -e "Bir karakter giriniz:\c"

read deger

case $deger in
	[a-z] ) # bu sekilde de bir kontrol yapabiliriz
	echo "Kullanici $deger harf girisi yapti, a-z";;
	[0-9] )
	echo "Kullanici $deger rakam girisi yapti, 0-9";;
	? )
	echo "Kullanici $deger ozel karakter girisi yapti";;
	* )
	echo "Bilinmeyen karakter"
esac



