#! /bin/bash

# read kullanimi

echo "Isminiz: "
read isim # input kullanimi gibi bize soruyor
echo "Ismim $isim"

echo "Isimler: "
read isim1 isim2 isim3
echo "Isimler $isim1, $isim2, $isim3"

read -p 'Isminiz: ' isim4
echo "Ismim $isim4"

read -p 'Isminiz' isim5
read -s 'Sifreniz' sifre # yazdigimizin gorunmesini istemiyorsak

echo "Ismim $isim5"
echo "Sifrem $sifre"

echo "Isminizi giriniz: "
read
echo "Ismim $REPLY" # degisken atamadan degerimizi almaya yaradi


echo "Isimler: "
read -a isimler                   # -a argument demek
echo "Isimler: ${isimler[0]},${isimler[1]},${isimler[2]}" # isimin 0. indexini yada 1. yazma sekli 






