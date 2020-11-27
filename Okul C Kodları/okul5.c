#include <stdio.h>



int main(){
	
	int deger = 1;
	
	while(deger){
		char str;
		scanf("%c",&str);
		if (str == 'e' || str == 'E'){
			deger = 0;
		}
		else if (str == '0' || str == '1' || str == '2' ||str == '3'||str == '4'||str == '5'||str == '6'||str == '7'||str == '8'||str == '9'){
			
			printf("%c",str);
			
		}
		else{
			continue;
		}
		
	}	
	
	return 0;
}
