public class largPalinNum{
	public static void main(String [] args) {
		int max = findNum();
		System.out.println(max);
	}

	public static int findNum(){
		int palindrome = 0;
		int max = 0;
		for(int i = 100; i < 999; i++){
			for(int j = 100; j < 999; j++){
				if(isPalindrome(i*j)){
					palindrome = i*j;
					if(max < palindrome){
						max = palindrome;
						System.out.println(i + "," + j);
					}
				}

			}
		}
		return max;
	}

	public static int[] digits(int num){
		int len = Integer.toString(num).length();
		int [] sep = new int[len];
		for(int i = len-1; i >= 0; i--){
			sep[i] = num%10;
			num = num/10;
		}
		return sep;
	}

	public static boolean isPalindrome(int num){
		int [] sepNum = digits(num);
		int len = sepNum.length-1;
		for(int i = 0; i < (len)/2+1; i++){
			if(sepNum[i] != sepNum[len-i]){
				return false;
			}
		}
		return true;
	}
}
