#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	
	char can[100];
	
	char canan[100];
	
	int a;
	
	printf("Lutfen bir yazi giriniz\n");
	gets(can);// input olarak girilen bosluklar da alinir
	//scanf("%s",&can);
	printf("ikinciyi giriniz\n");
	gets(canan);
	
	printf("birinci yazinin sonuna kac karakter eklemek istersiniz\n");
	scanf("%d",&a);
	
	
	printf("Eklemeden once %s",can);
	printf("\n");
	
	strncat(can,canan,a);
	printf("birlestirmeden sonra %s",can);
	
	return 0;
}

