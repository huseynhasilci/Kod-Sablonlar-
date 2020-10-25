#include <stdio.h>


void insertionsort(int arr[],int size){
	int i,j;
	int element;
	
	for (i = 1; i<size;i++){
		element = arr[i];
		j = i-1;
		while (j>=0 && arr[j]>element){
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = element;
	}
	
	
	
	
}




int main(){
	
	
	int array[5] = {50,3,2,1,4};
	int size = 5;
	int i = 0;
	
	insertionsort(array,size);
	for (; i<size;i++){
		
		printf("%d ",array[i]);
		
		
	}
	
	
	
	return 0;
}

