#include <stdio.h>
#include <string.h>

int benimstrlen(char *p){
	
	int uzunluk = 0;
	int i = 0;
	
	for (; p[i] != '\0';i++){ //null karakter olmayana kadar dongu surecek
		
		uzunluk++;
		
		
	}
	return uzunluk;
	
}



int main(){
	
	/*char yazi[] = "Tura";
	
	char *p = yazi;
	
	printf("%s",p);*/
	
	char yazi[] = "Tura";
	
	printf("%d ",benimstrlen(yazi));
	
	
	
	return 0;	
}

