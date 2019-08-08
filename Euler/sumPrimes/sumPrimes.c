#include <stdio.h>
#include <string.h>
//Sieve of Eratosthenes

#define ISBITSET(x, i) (( x[i>>3] & (1<<(i&7)) ) != 0)  //">>" operator will "insert a zero on the left and 
                                                        // push every bit to the right, and the rightmost will be thrown away".
                                                        // [i>>3] right bit shift of 3.
#define SETBIT(x, i) x[i>>3] |= (1<<(i&7));
#define CLEARBIT(x, i) x[i>>3] &= (1<<(i&7)) ^ 0xFF; //i&7 Bitwise AND

long long sumPrimes(int n) {
    char b[n/8+1];
    long long i, p;
    long long s = 0;

    memset(b, 255, sizeof(b)); // void *memset(void *str, int c, size_t n) copies the character c 
                               // (an unsigned char) to the first n characters of the string pointed to, by the argument str.
    for (p=2; p<n; p++) {
        if (ISBITSET(b,p)) {
            //printf("%d\n", p);
            s += p;
            for (i=p*p; i<n; i+=p) {
                CLEARBIT(b, i); }
            }
        }
    return s; 
}

int main(void) {
    printf("%lld\n", sumPrimes(2000000));// for signed long long as signified by lld
    return 0;
}

