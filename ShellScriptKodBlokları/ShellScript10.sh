#! /bin/bash

#while dongusu

i=1

while [ $i -lq 10 ] 
do
	echo $i
	((i++)) # i=$((i+1))
	sleep 1 # bir saniye bekle 
	#gnome-terminal her seferine bir terminal acmaya yaradi
	# xterm yazarak baska bir terminal acmamizi sagladi
done





