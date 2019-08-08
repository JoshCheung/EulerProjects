public class sumPrimes{
	public static void main(String[] args){
		//long sum = sum(10);
		//System.out.println(sum);
		//Long l1 = Long.parseUnsignedLong()
		float sum = sum(2000000);
		//String sumString = Long.toString(sum);
		System.out.println(sum);
	}

	public static boolean isPrime(int num){
		for(int i = 2; i < num; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}

	public static float sum(int val){
		float sum = 0;
		for(int i = val; i > 1; i--){
			if(isPrime(i)){
				sum+= i;
			}
		}
		return sum;
	}
	/*
	public static String print(long sum){
		String temp = "";
		while(sum > 0){
			//System.out.println(sum);
			temp+=sum%10;
			sum/=10;
			//System.out.println(sum);
		}
		return temp;
	}
	*/
}
