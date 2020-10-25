#include <stdio.h>

int carp(int matris[],int size){ //arrayin boyutunu da gondermemiz gerekiyor
	
	int carpim = 1;
	int i;
	for (i = 0; i<size; i++){
		
		carpim *= matris[i];
		
		
	}
	return carpim;
	
}

void bastir(int matris[][4],int size){// ic ice gonderme sekli
	
	
	int i,j;
	
	for (i = 0; i<size; i++){
		for(j = 0;j<4;j++){
			
			
			printf("%d ",matris[i][j]);
			
		}
		printf("\n");
	}
	
	
	
	
	
}



int main(){
	
	/*
	}int sayilar[5] = {1,2,3,4,5};
	
	printf("%d",carp(sayilar,5));*/
	int matris[3][4];
	
	int i,j;
	
	for (i = 0; i<3;i++){
		for(j = 0; j<4;j++){
			scanf("%d",&matris[i][j]);
			
		}
	}
	bastir(matris,3);
	
	return 0;
	
}










