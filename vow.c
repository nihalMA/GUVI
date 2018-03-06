#include<stdio.h>
#include<conio.h>
void main()
{
char l;
clrscr();
printf("Enter The Character");
scanf("%c",&l);
if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u')
{
printf("vowel");
}
else
{
printf("consonant");
}
getch();
}
