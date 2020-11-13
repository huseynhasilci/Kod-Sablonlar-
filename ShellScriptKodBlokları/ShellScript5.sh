#! /bin/bash

#aritmetik islemler 1-)

echo $(( 1+1 )) # toplama islemi yaptik bu sekilde 

sayi1=25
sayi2=5

echo $(( sayi1+sayi2 ))
echo $(( sayi1-sayi2 ))
echo $(( sayi1*sayi2 ))
echo $(( sayi1/sayi2 ))
echo $(( sayi1%sayi2 ))

echo $( expr $sayi1 + $sayi2 ) # bu sekilde de islemi yapabilmis olduk 'expr' sayesinde
echo $( expr $sayi1 - $sayi2 )
echo $( expr $sayi1 \* $sayi2 ) # expr ile carpma yapmak icin basina ters silas koymak gerekiyor '\'
echo $( expr $sayi1 / $sayi2 )
echo $( expr $sayi1 % $sayi2 )

#aritmetik islemler 2-)

echo "20.5+5" | bc # toplama istemini gerceklestirdi
echo "20.5-5" | bc 
echo "20.5*5" | bc 
echo "20.5/5" | bc 
echo "20.5%5" | bc 


echo "scale=2;20.5/5" | bc # virgulden sonra kac degeri alacagimizi soyledik c de oldugu gibi %2.f gibi

sayi1=20.5
sayi2=5

echo "scale=2;$sayi1/$sayi2" | bc


echo "scale=2; sqrt($sayi2)" | bc -l # -l matematik kutuphaneinden sqrt u kullaniyorum demek 
echo "scale=2; $sayi2^3" | bc -l # sayi ikinin kubunu aldik





























