#include <stdio.h>

int main(){
	
	
	
	int i;
	int j;
	for (i = 0,j = 1; i<10 && j<5; i++, j++){
		printf("%d %d\n",i,j);
	}
	printf("******************************************");
	for (i = 0; i<10; i++){
		for (j = 0; j<10; j++){
			printf("%d %d\n",i,j);
			
		}
		
	}
	
	
	
	return 0;
}












