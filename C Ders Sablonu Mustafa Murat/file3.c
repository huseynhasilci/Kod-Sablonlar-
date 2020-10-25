#include <stdio.h>

int main(){
	
	FILE *filep = fopen("yaz.txt","a");
	
	char text[256];
	
	
	if (filep == NULL){
		printf("Dosya Olsumamistir");
	}
	else{
		printf("Dosya Olusmustur\n");
		printf("Bir sey yazin");
		fgets(text,256,stdin);
		fputs(text,filep);
		printf("Dosyaya yazildi\n");
		fclose(filep);
	}
	
	return 0;
}


