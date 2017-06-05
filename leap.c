#include<stdio.h>
void main()
{
int year;
printf("Enter a year:");
scanf("%d",&year);
if(year%4==0)
{
if(year%100==0)
{
if(%400)
printf("%d lear year",year);
else
printf("%d not leap year");
}
else
printf("%d leap year",year);
}
else
printf("%d not leap year",year);
return 0;
}