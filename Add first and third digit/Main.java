#include<stdio.h>
int main()
{
  //Type your code here
  int num,a,b,sum;
  scanf("%d",&num);
  a=num/100;
  b=num%10;
  //printf("%d %d",a,b);
  sum=a+b;
  printf("%d",sum);
  return 0;
}