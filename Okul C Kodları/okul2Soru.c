#include <stdio.h>

int main(){
	
	char type;
	int degree;
	
	int celcius;
	
	printf("Deger girin: ");
	scanf("%c %d",&type,&degree);
	
	if (type != 'F' && type != 'C'){
		printf("Incorrect input");
		
	}
	else{
		if (type == 'F'){
			celcius = (degree-32)*5/9;
			if (celcius<21){
				printf("Cold");
			}	
			else if (celcius >25){
				printf("Hot");
				
			}
			else if(celcius>21 || celcius <25){
				printf("Warm");
			}
		}
		else if (type == 'C'){
			if (degree<21){
				printf("Cold");
			}	
			else if (degree >25){
				printf("Hot");
				
			}
			else if(degree>21 || degree <25){
				printf("Warm");
			}
		}

		
	}
	
	
	
	
	return 0;
}



