#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(){
	
	int sonuc;
	
	
	char can[15] = "abcdef";
	char canan[15] = "ABCDEF";
	
	sonuc = strcmp(can,canan); // asci kodlarina gore hangisinin daha buyuk asci degeri tasidigina gore 1 ya da -1 degeri dondurur
								// ilk girilen parametreyi kiyaslar
	printf("%d",sonuc);
	if (sonuc <0){
		printf("Can canandan daha kucuktur");
		
	}
	else if (sonuc>0){
		printf("Can canandan daha buyuktur");
		
	}
	else{
		
		printf("Ikiside birbirine esittir");
	}
	return 0;
}

