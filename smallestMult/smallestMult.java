public class smallestMult{
	public static void main(String [] args){
		long num = findNum();
		System.out.println(num);
	}
	

	public static long findNum() {
		long i = 2520;
		boolean found = false;
		while (!found) {
			i += 2520;
			boolean divis = true;
			for (int j = 11; j <= 20; j++) {
				if (i % j != 0) {
					divis = false;
                //System.out.println(i + " is not divisible by " + j);
					break;
				}
				else {
                //System.out.println(i + " is divisible by " + j);
				}
			}
			if (divis) {
				found = true;
			}
		}
		return i;
	}
}
/*
	public static boolean isPrime(int num){
		for(int i = 2; i < num; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}

	public static boolean canDivide(int product, int num){
		for(int i = 1; i <= num; i++){
			if(product%i != 0){
				return false;
			}
		}
		return true;
	}
}

*/