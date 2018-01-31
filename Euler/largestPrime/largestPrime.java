public class largestPrime {
	public static void main(String[] args){
		long num = 600851475143L;
		//int num = 13195;
		int pf = primeFactor(num);
		System.out.println(pf);	
	}
	public static int primeFactor(long num){
		int factor = 1;
		int largest = 0;
		while(num > 1){
			if(num%factor == 0){
				num/=factor;
				largest = factor;
			}
			factor++;
		}
		return largest;
	}
}
