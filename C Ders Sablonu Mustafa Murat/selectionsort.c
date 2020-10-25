#include <stdio.h>

void selectionsort(int arr[],int size){
	
	int i,j;
	int minindex;
	
	for(i = 0; i<size; i++){
		minindex = i;// min indexi 0 kabul ettik
		for (j = i; j<size;j++){
			if (arr[j]< arr[minindex]){// daha sonra baktik ki min indeks kucuk j indeksinden min indeksini degistirdik
				minindex = j;
				
				
			}
			
		}
		int temp = arr[i];
		arr[i] = arr[minindex]; // daha sonra min indexin yerini degistirip sort ettik sort olana dek
		arr[minindex] = temp;
	}
	
	
}


int main(){
	
	
	int array[5] = {50,3,2,1,4};
	int size = 5;
	int i = 0;
	
	selectionsort(array,size);
	for (; i<size;i++){
		
		printf("%d ",array[i]);
		
		
	}
	
	
	
	return 0;
}
