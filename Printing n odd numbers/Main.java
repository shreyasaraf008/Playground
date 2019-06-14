#include <stdio.h>
int main() {
	//Type your code
  int i,num,temp;
  scanf("%d",&num);
  temp=num;
  for(i=1;i<=temp;i++)
  {
  
    if(i%2==1){
    printf("%d\n",i);
    temp++;
    }
   // printf("%d",temp);
   
  }
	return 0;
}