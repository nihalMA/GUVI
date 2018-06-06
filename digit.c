#include<stdio.h>
int main()
{
int t=0,r=0,n;
printf("Input:");
scanf("%d",&n);
while(n>0)
{
t=n%10;
r=r*10+t;
n=n/10;
}
printf("%d Output:",r);
return 0;
}
