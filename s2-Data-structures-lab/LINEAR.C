#include <stdio.h>
#include <conio.h>
void main() {

	int a[10], i , n , num , flag = 0;
	clrscr();
	printf("enter the range: ");
	scanf("%d", &n);
	for (i = 0; i < n; i++ )
	{
	 scanf("%d", &a[i]);
	}

	printf("element to be search: ");
	scanf("%d", &num);

	for (i = 0; i < n ; i++)
	{
	  if ( num == a[i])
	  {
	   flag = 1;
	   printf("Element is found");
	   getch();
	  }
	}

	if ( flag == 0)
	{
	printf("element not found");
	};
	getch();
}