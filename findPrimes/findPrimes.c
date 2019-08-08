#include <stdlib.h>
#include <stdio.h>
typedef int bool;
#define true 1;
#define false 0;

int isPrime(int num){
	for(int i = 2; i < num; i++){
		if(num%i == 0){
			return false;
		}
	}
	return true;
}

int findPrime(int num){
	int counter = 0;
	for(int i = 2; i < 10000000; i++){
		if(isPrime(i)){
			counter++;
		}
		if(counter == num){
			return i;
		}
	}
	return -1;
}


int main(void){
	int prime = findPrime(10001);
	printf("%d\n", prime);
}