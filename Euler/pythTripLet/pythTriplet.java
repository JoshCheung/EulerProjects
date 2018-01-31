public class pythTriplet{
	public static void main(String [] args){
		System.out.println(pyth());
	}

	public static long pyth(){ //(m < n)
		long prod = 0;
		for(int i = 1; i < 1000; i++){
			for(int j = 1; j < 1000; j++){
				double c = Math.sqrt((int)Math.pow(j, 2) + (int)Math.pow(i, 2));
				if(i+j+c == 1000.0){
					System.out.println(i+", "+ j + ", "+ c);
					double val = i*j*c;
					prod = (long)val;
					break;
				}
			}
		}
		return prod;
	}
}