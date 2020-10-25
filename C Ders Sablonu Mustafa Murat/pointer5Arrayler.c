#include <stdio.h>


int max(int *sayilar,int size){// burada sayilar[] olarak tanimlamak yerine pointer olarak tanimladigimizda arraymis gibi davraniyor
	int maks = sayilar[0];
	int i;
	for (i = 1; i<size;i++){
		if (sayilar[i]> maks){
			maks = sayilar[i];
		}
		
	}
	return maks;
}





int main(){
	
	
	
	int sayilar[5] = {1,2,3,4,5};
	
	int maks = max(sayilar,5);
	
	printf("Sayilar Dizisinin en buyuk elemani %d dir.",maks);
	
	
	
	
	
	
	//int *p = sayilar;
	
	/*printf("%u\n",p); // int degerler 4 byte kadar yer kaplarlar
	
	printf("%u\n",p+1);
	
	printf("%u\n",p+2);
	
	printf("%u\n",p+3);*/
	
	/*printf("%d\n",*p);
	printf("%d\n",*(p+1));
	printf("%d\n",*(p+2));
	printf("%d\n",*(p+3));
	printf("%d\n",*(p+4));*/
	
	/*printf("%d\n",p[0]);
	printf("%d\n",p[1]);
	printf("%d\n",p[2]);
	printf("%d\n",p[3]);
	printf("%d\n",p[4]);*/
	
	return 0;
}


