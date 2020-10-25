#include <stdio.h>

int main(){
	int i;
	int j;
	int sum = 0;
	int matris[3][5] = {{3,5,1,3,2},{4,4,4,5,5},{9,8,9,7,7}};
	
	
	
	
	for(j = 0; j<5; j++){
		for (i = 0; i<3;i++){
			
			sum += matris[i][j];
			
		}
		
		printf("%d ",sum);
		sum = 0;
	}
	
	
	
	return 0;
}


