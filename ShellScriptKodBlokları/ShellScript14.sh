#! /bin/bash

# fonksiyonlar

function Merhaba(){

	echo "Merhaba dostlar"
	

}	

cikis(){


	exit
}

Merhaba

echo -e "Bir sayi giriniz:\c "

read sayi

function KaresiniAl(){

	echo "Sayinin karesi = $((sayi*sayi))"

}

KaresiniAl
#cikis

function cikti(){
	echo $1 $2 #bunu yazinda  asgida yazilan ahmeti getirir
}

cikti Ahmet evde















