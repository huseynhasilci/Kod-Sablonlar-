#include <stdio.h>

void hatayiBas(int hata){
	
	printf("Hata kodu %d",hata);
}





int main (){
	
	int sayi;
	
	scanf("%d",&sayi);
	
	if (sayi<0){
		hatayiBas(404);
	}
	else{
		printf("Helal biremin");
	}
	
	
	return 0;
	
}




