#include<stdio.h>
int main()
{
    int n,i,sum=0;
    scanf("Input:%d",&n);
    if(n>0)
    {
    for(i=0;i<n;i++)
    {
        sum=sum+i;
    }
    printf("Output:%d",sum);
    }
    else
    {
        printf("Invalid input");
    }
    return 0;
}
