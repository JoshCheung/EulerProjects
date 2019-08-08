import java.lang.*;

public class rand5{
	public static void main(String[] args){
		int rand7 = rand();
		//System.out.println(rand7);
		System.out.println(rand7%7+1);

		//int random = randSum();
		//System.out.println(random);

		
	}
	
	public static int rand(){
		int num = rand5();
		int num2 = rand5();
		int rand25 = 5*(num -1) + num2;
		if(rand25 < 5){
			return rand();
		}	
		return rand25;
	}
	

	public static int randSum(){
		int sum = 0;
		for(int i = 0; i < 7; i++){
			sum+=rand5();
		}
		return sum%7+1;
	}


	public static int rand5(){
		int rand5 = (int)(Math.random()*5 + 1); //gives a random number from 1 - 5
		return rand5;
	}

}



/*
		int rand5 = (int)(Math.random()*5 + 1); //gives a random number from 1 - 5
		System.out.println("rand5: " + rand5);
		float sevFive = (float)7/5;
		//System.out.println(sevFive);
		double rand7 = (double) rand5 * (sevFive) + 1;
		//System.out.println(rand5 * (sevFive));
		System.out.println("rand7: " + (int)rand7);
*/