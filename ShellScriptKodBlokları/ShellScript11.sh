#! /bin/bash

# for dongusu

for (( i = 0;i<=10;i++ ))
do 
	echo $i
done

for i in 1 2 3 4 5 # ls ya da pwd olabilir
do
	echo $i
done

for i in ls pwd # ls ya da pwd olabilir
do
	echo $i
	$i
done


for i in {1..10..2} # 1 deb baslayip 10 a kadar devam edip 2 ser 2ser artiyor
do
	echo $i
done













