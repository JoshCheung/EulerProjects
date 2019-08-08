public class findPrimes{
	public static void main(String[] args){
		int prime = findPrime(10001);
		System.out.println(prime);
	}

	public static boolean isPrime(int num){
		for(int i = 2; i < num; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}

	public static int findPrime(int num){
		int counter = 0;
		for(int i = 2; i < 10000000; i++){
			if(isPrime(i)){
				counter++;
			}
			if(counter == 10001){
				return i;
			}
		}
		return -1;
	}
}
