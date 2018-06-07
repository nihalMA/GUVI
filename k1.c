#include<stdio.h>
int main()
{
    int n,k,i,sum=0;
    int a[10];
    printf("Enter the Limit");
    scanf("%d",&n);
    if(n>0)
    {
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    scanf("%d",&k);
    for(i=0;i<k;i++)
    {
        sum=sum+a[i];
    }
    printf("%d",sum);
    }
    else
    {
        printf("Invalid input");
    }
    return 0;
}
