#! /bin/bash

# arrayler diziler

OS=( 'Linux' 'Windows' 'UNIX' )

echo "${OS[@]}" #tum elemanlarini gostermeye yariyor ayni zamanda bir arrayi de bu sekilde yazidriyoruz [1] gibi

echo "${OS[2]}" # arrayin 2. indeksini aldik

echo "${!OS[@]}" # ! isareti sayesind etum dizinin inkes sirasini gosterir

echo "${#OS[@]}" # dizinin boyutunu bize verir '# sayesinde'

OS[3]='Mac' # bu sekilde ucuncu indeksine eklemis olduk -------------------------------- unset sayesinde 1. indeksi silmis olduk

echo "${OS[@]} 

unset OS[1]  

echo "${OS[@]}


