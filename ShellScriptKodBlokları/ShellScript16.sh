#! /bin/bash

# argumanlar uygulama 1-2

echo "$0 programini calstirdiniz"
echo "Ilk arguman= $1 "
echo "Ikinci arguman= $2"
echo "Ucuncu arguman= $3"
echo "Butun argumanlar= $*"
echo "Arguman sayisi= $#"
shift # birinci argumani yok sayar 2. argumani 1. arguman yapar


# uygulama2

echo "$1 listeleniyor"

/bin/ls -l "$1" #verilen $1 dosyasinin altindeki seyleri listeledik
 
#dosya dogrulama uygulamasi 3






