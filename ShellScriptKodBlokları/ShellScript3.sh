#! /bin/bash


# arguments local variables

echo $1 $2 $3 # bu dosyayi cagirirken ./ShellScript3.sh (ne girmek istenirse) birden fazla girilebilir $2 $3 sayesinde

echo $@ # butun degisleri yazdirir

echo $# # kac tane ifade oldugunu gosterir


dizi=("$@") # bunun sayesinde tek tek dizi gibi tutmasini sagladik

echo ${dizi[0]} ${dizi[1]} ${dizi[2]} # girilen degerlerden 0. indeksini yazdirmis olduk sayesinde

