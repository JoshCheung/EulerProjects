#include <stdlib.h>
#include <stdio.h>

int findSquares(){
	int sumSquares = 0;
	for(int i = 1; i <= 100; i++){
		sumSquares += i*i;
	}
	return sumSquares;
}

int findSquare_100(){
	int sum;
	for(int i = 1; i <= 100; i++){
		sum+=i;
		printf("sum = %d\n", sum);
	}
	return sum*sum;
}

int main(void){
	int sum = findSquare_100();
	int sumSquares = findSquares();
	printf("sum = %d\n", sum);
	printf("sumSquares = %d\n", sumSquares);
	int newVal = sum - sumSquares;
	printf("newVal = %d\n", newVal);
}