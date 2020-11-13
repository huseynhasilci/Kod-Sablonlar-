#! /bin/bash

# select dongusu

select iller in Ankara Izmir Istanbul
do
	case $iller in
	Ankara )
		echo "Ankara secildi";;
	Izmir )
		echo "Izmir secildi";;
	Istanbul )
		echo "Istanbul secildi";;
	* )
		echo "Gecersiz islem";;
	esac 
done




