#include <stdio.h>
#include <string.h>
char *dondur(char *p,int index){
	
	int uzunluk = strlen(p);
	
	if (index > uzunluk){
		return NULL;
	}
	else{
		
		return p+index; //p nin indeksinden sonrasi kadar bastir zilim yazdirmis oldu
		
		
		
	}
	
}




int main(){
	
	//int *p = NULL; // ya da 0 yazabiliriz
	
	char dizi[] = "yazilim";
	
	char *p = dondur(dizi,2);
	
	if (p == NULL){
		printf("Pointer Null");
		
	}
	else{
		
		printf("%s",p);
		
		
	}
	
	
	return 0;
}


