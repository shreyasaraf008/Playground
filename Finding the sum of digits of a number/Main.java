#include <stdio.h>
int main() {
	//Type your code
  int num,a=0,sum=0;
  scanf("%d",&num);
    while(num!=0)
    {
      a=num%10;
      sum=sum+a;
      num=num/10;
    }
     printf("%d",sum);
  
	return 0;
}