#! /bin/bash
# if bloklari
sayi=9

if [ $sayi -nq 9 ] #bosluk birakarak yazilmak zorunda  
then
echo "Kosul dogru"
fi


if (( $sayi < 9 )) #bosluk birakarak yazilmak zorunda  
then
echo "ilk Kosul dogru"
elif (( $sayi > 9 ))
then
echo "Ikinci kosul dogru"
else
echo "Sayi 9"
fi

ad=Suleyman

if [ $ad == "Suleyman" ] #string kontrol sekli
then
echo "Isim suleyman"
fi

harf=a

if [[ $harf < b ]]
then
echo "b ifadesi a'dan buyuktur kosul dogru"
fi

if [[ $harf == b ]]
then
echo "b ifadesi a'dan buyuktur kosul dogru"
elif [ $harf == "a" ]
then
echo "Harf a"
else
echo "Harf a ve b degildir"
fi










