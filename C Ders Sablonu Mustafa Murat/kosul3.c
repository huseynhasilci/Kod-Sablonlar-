#include <stdio.h>

int main(){
	
	
	int vize1,vize2,final;
	float dersort;
	float ortalama;
	printf("1. vize notunuzu giriniz:");
	scanf("%d",&vize1);
	
	printf("2. vize notunuzu giriniz:");
	scanf("%d",&vize2);
	
	printf("Final notunuzu giriniz:");
	scanf("%d",&final);
	
	printf("Derecenizi giriniz:");
	scanf("%f",&ortalama);
	
	dersort = (vize1 + vize2 + final)/3.0;
	
	if (dersort >60){
		printf("Dersten Gectiniz...");
	}
	
	else if(dersort >50 && dersort < 60){
		printf("Dersten Bute kaldiniz...");
		if (ortalama < 2.5){
			printf("Bute giremezsiniz");
		}
		else{
			printf("Bute girebilirsiniz");
		}
	}
	
	else{
		
		printf("Dersten kaldiniz...");
		
	}
	
	
	
	
	
	
	
	
	
	
	return 0;
}












