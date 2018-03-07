#include<stdio.h>
#include<conio.h>
void main()
{
char a;
clrscr();
printf("Enter The Input:");
scanf("%c",&a);
if(a>=65&&a<=95||a>=97&&a<=122)
{
printf("Alphabet");
}
else
{
printf("NO");
}
getch();
}
