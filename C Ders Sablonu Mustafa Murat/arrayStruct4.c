#include <stdio.h>

struct Ogrenci{
	
	char isim[20];
	char soyisim[20];	
	int numara;
	
	
	
	
};



int main(){
	
	struct Ogrenci ogrenciler[3];
	int i;
	
	for (i = 0; i<3;i++){
		scanf("%s %s %d",&ogrenciler[i].isim,&ogrenciler[i].soyisim,&ogrenciler[i].numara); // consele acildiginda bosluk birakip yaziyoruz
	}
	
	for (i = 0; i<3;i++){
		printf("%s %s %d",ogrenciler[i].isim,ogrenciler[i].soyisim,ogrenciler[i].numara);
	}
	
	return 0;
}
