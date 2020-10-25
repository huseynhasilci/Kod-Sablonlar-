#include <stdio.h>

void degerDegistir(int a,int b){
	
	int gecici = a;
	
	a = b; 
	b = gecici;
	
	printf("a: %d b: %d\n",a,b);
}



int main(){
	
	
	int x = 5,y=10;
	
	
	degerDegistir(x,y);
	
	printf("x: %d y: %d",x,y);
	
	
	
	return 0;
}
