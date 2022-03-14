#include <iostream>

void LinearSearch() {

	int n = 0;
	int arr[20];
	int searchElement;

	std::cout << "input no. of elements: " << std::endl;
	std::cin >> n;


	std::cout << "input values: " << std::endl;
	
	for (int i = 0; i < n; i++) {
		std::cin >> arr[i];
	}

	std::cout << "search elment: " << std::endl;
	std::cin >> searchElement;

	for (int i = 0; i < n; i++ ) 
	{
		if (arr[i] == searchElement) {
			std::cout << "elment found " << std::endl;
		}
	}

}