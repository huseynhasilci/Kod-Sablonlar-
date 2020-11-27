#include <stdio.h>
int main() {
	int sec, h, m, s;
	printf("Input seconds: ");
	scanf("%d", &sec);
	
	h = (sec/3600); 
	
	m = (sec -(3600*h))/60;
	
	s = (sec -(3600*h)-(m*60));
	
	printf("H - %02d\n",h);
	printf("M - %02d\n",m);
	printf("S - %02d\n",s);	
	
	printf("H:M:S - %02d:%02d:%02d\n",h,m,s);
	
	return 0;
}
