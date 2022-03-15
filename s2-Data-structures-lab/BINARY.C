#include <stdio.h>
#include <conio.h>

void main() {
     int arr[50], i, n, left= 0, right = 0, middle, iteam , flag = 0;
     printf("no. of elements: ");
     scanf("%d", &n);
     printf("enter the elements to array:");
     for (i = 0; i < n ; i++ ) {
      scanf("%d", &arr[i]);
     }

     printf("enter search element: ");
     scanf("%d", &iteam);

     right = n-1;

     while (left <= right)
     {

	middle = (left + right) /2;
	if ( iteam == arr[middle])
	{
		flag = 1;
		break;
	}
	else if ( iteam < arr[middle])
	{
		right  = middle -1;
	}
	else
	{
		left = middle + 1;
	}

     }

     if ( flag == 1) {
	printf("element found ");
	getch();
     } else {

	printf("no such element found");
	getch();
     }

}