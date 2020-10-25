#include <stdio.h>

int main(){
	
	/*int i;
	
	i = 0;
	
	while(i<10){
		printf("Merhabalar\n");
		i++;
	}*/
	
	
	int n;
	int fact = 1;
	
	printf("Faktoriyel istediginiz sayiyi giriniz");
	scanf("%d",&n);
	
	while(n > 1){
		fact = fact * n;
		n--;
		
		
	}
	printf("%d",fact);
	return 0;
}












