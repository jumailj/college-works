#include "stdio.h"
#include "conio.h"

void main() {

	int arr[10], i , j, n;
	clrscr();

	printf("number of elements:");
	scanf("%d", &n);

	for (i = 0; i < n ; i++ ) {
	 scanf("%d", &arr[i]);
	}

	for (i = 0; i < n-1; i++ ) {
	    for ( j = 0; j < n-i-1; j++ ) {
		  if ( arr[j+1] > arr[j]) {
		   int temp;
			temp = arr[j+1];
			arr[j+1] = arr[j];
			arr[j] = temp;
		  }
	    }

	}

	 printf("sorted array: \n");
	 for (i = 0; i < n; i ++ ) {
	  printf("%d ", arr[i]);
	 }

	 getch();


}