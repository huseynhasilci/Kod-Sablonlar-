#include <stdio.h>
#include <string.h>

struct Ogrenci{
	
	char isim[20];
	char soyisim[20];
	int numara;
	
};

struct Ogrenci *degerAl(struct Ogrenci *p){
	
	strcpy(p->isim,"Mehmet");
	strcpy(p->soyisim,"Gencol");
	p->numara = 455;
	
	return p;
}


void goster(struct Ogrenci *p){
	
	printf("Ogrencinin biligleri %s %s %d ",p->isim,p->soyisim,p->numara);
	
	
	
}




int main(){
	struct Ogrenci *tut;
	struct Ogrenci ogrenci = {"Ahmet","Gedikli",505};
	
	tut = degerAl(&ogrenci);
	
	printf("%s %s %d",tut->isim,tut->soyisim,tut->numara);
	
	return 0;
}



