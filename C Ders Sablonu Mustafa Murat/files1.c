#include <stdio.h>

int main(){
	
	FILE *filep = fopen("yazilimbilimi.txt","w");// "w" ---> write, "r" ---> read, "a" ---> "w+" ---> yazma okuma "a+" --->
	
	if (filep == NULL){
		
		printf("Dosya Olusturulamadi");
	}
	else{
		printf("Dosya Olusturuldu");
	}
	
	return 0;
}




