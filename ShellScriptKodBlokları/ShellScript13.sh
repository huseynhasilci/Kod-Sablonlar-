#! /bin/shell

for  (( i=0;i<=10;i++ ))
do
	if [ $i -gt 5 ]
	then
		break
	fi
	echo "$i"
done


for  (( i=0;i<=10;i++ ))
do
	if [ $i -gt 5 ]
	then
		continue
	fi
	echo "$i"
done

b=1
until [ $i -ge 10 ] 
do
	echo $i
	((i++))
done

