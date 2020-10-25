#include <stdio.h>
#include <string.h>


int main(){
	char veri[25] = "Yazilim Bilimi";
	int uzunluk = strlen(veri);
	int i;
	FILE *filep = fopen("yazilimbilimi.txt","w");
	
	if (filep == NULL){
		printf("Dosya Olusturulamadi");
	}
	else{
		printf("Dosya Olusturuldu\n");
		for (i = 0; i<uzunluk;i++ ){
			fputc(veri[i],filep);
			printf("Yazilan karekter: %c\n",veri[i]);
		}
		fclose(filep);
		
	}
	
	
	
	return 0;
}
