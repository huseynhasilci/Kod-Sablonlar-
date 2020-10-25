#include <stdio.h>
#include <string.h>
struct Ogrenci{
	
	char isim[20];
	char soyisim[20];	
	int numara;
	
};


int main(){
	
	struct Ogrenci *tut;
	struct Ogrenci ogrenci;
	
	strcpy(ogrenci.isim,"Mustafa");
	strcpy(ogrenci.soyisim,"Furkan");
	ogrenci.numara = 24;
	
	
	tut = &ogrenci;
	
	printf("%s %s %d\n",ogrenci.isim,ogrenci.soyisim,ogrenci.numara);
	
	printf("%s %s %d",tut->isim,tut->soyisim,tut->numara); // pointerlar ile icerisine bu sekilde gittik 
	
	
	return 0;
}

