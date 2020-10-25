#include <stdio.h>

struct Ogrenci{
	
	char isim[20];
	char soyisim[20];	
	int numara;
	
};

void goster(struct Ogrenci a){
	
	printf("Ogrencinin bilgileri: %s %s %d",a.isim,a.soyisim,a.numara);
	
	
}

struct Ogrenci degerAl(){
	
	struct Ogrenci yeni;
	
	printf("Bilgilerini giriniz: ");
	
	scanf("%s %s %d",&yeni.isim,&yeni.soyisim,&yeni.numara);
	
	return yeni;
	
}



int main(){
	
	//struct Ogrenci ogrenci = {"Mustafa","Coskun",156};
	
	struct Ogrenci ogrenci = degerAl();
	
	goster(ogrenci);
	
	return 0;
}

