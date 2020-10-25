#include <stdio.h>

int topla(int sayi1,int sayi2){
	return (sayi1 + sayi2);
}

int faktoriyel(int sayi){
	
	int fact = 1;
	
	for (; sayi > 0;sayi--){
		
		fact *= sayi;
		
	}	

	return fact;
}



int main(){
	
	/*int sayi1;
	int sayi2;
	
	scanf("%d %d",&sayi1,&sayi2);
	printf("%d",topla(sayi1,sayi2));*/
	
	int n;
	scanf("%d",&n);
	
	printf("Faktoriyel: %d",faktoriyel(n));
	
	return 0;
}
