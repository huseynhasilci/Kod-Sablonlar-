#include <stdio.h>

int main (){
	
	float sayilar[5];
	
	int i;
	
	float toplam = 0.0;
	for (i = 0; i<5; i++){
		
		printf("Hangi sayiyi gireceksiniz: ");
		scanf("%f",&sayilar[i]); // bu da arraylere bir deger ekleme islemi
		
		
		
	}
	
	for (i = 0; i<5;i++){
		toplam += sayilar[i];
	}
	printf("Girdiginiz sayilarin ortalamasi %.2f dir",toplam/5);
	
	
	return 0;
}


















