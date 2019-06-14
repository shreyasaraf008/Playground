#include <stdio.h>
int main() {
	//Type your code
   int n,ld,fd,sum=0;
  scanf("%d",&n);
  ld=n%10;
  //printf("%d",ld);
  while(n>=100){
  n=n/10;
  }
  fd=n/10;
  sum=ld+fd;
  printf("%d",sum);
  
	return 0;
}