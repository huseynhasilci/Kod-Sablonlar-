#! /bin/bash
#local global degiskenler

function cikti(){
	local isim=$1 # fonksiyon icerisinde kullanmak icin bunu yazdik
	echo "Ismim $isim"
}

isim="Mehmet"

echo "Ismim $isim" # mehmet yazacak

cikti Ahmet #ahmet yazacak

echo "Ismim $isim" # eger local yazmasaydik fonksiyonun icerisine yeniden ahmet yazacakti ancak simdi mehmet yazacak










