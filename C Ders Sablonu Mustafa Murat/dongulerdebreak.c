#include <stdio.h>

int main(){
	
	int toplam = 0;
	
	int i;
	
	int sayi;
	
	for (i = 0; i< 99999; i++){
		
		printf("Sayiyi giriniz cikmak icin -1 e basin");
		scanf("%d",&sayi);
		if(sayi == -1){
			break;
		}
		else{
			
			toplam += sayi;
			
		}
		
	}
	printf("Toplam %d",toplam);
	
	
	return 0;
}











