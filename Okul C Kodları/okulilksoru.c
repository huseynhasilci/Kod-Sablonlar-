#include <stdio.h>


int main(){
	
	int a;
	int b;
	char c;
	char d;
	printf("First deger");
	scanf("%d %d %c %c",&a,&b,&c,&d);
	
	
	
	
	
		
	if (a%b == 0){
		if (c == '+'){
			int z = a+b;
			printf("Deger %d",z);
		}
		else if (c == '-'){
			int z = a-b;
			printf("Deger %d",z);
		}
		else if (c == '/'){
			int z = a/b;
			printf("Deger %d",z);
		}
		else{
			int z = a*b;
			printf("Deger %d",z);
		}
		
	}
	if (a%b > 0){
		if (d == '+'){
			int z = a+b;
			printf("Deger %d",z);
		}
		else if (d == '-'){
			int z = a-b;
			printf("Deger %d",z);
		}
		else if (d == '/'){
			int z = a/b;
			printf("Deger %d",z);
		}
		else{
			int z = a*b;
			printf("Deger %d",z);
		}
		
	}
	if(a < 0 || b<0){
		printf("Incorrect input");
	}
	
	return 0;
}

