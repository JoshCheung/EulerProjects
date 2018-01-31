public class largestProduct{
	public static void main(String [] args) {
		//String series = "987123";
		String series = "73167176531330624919225119674426574742355349194934"
						+"96983520312774506326239578318016984801869478851843"
						+"85861560789112949495459501737958331952853208805511"
						+"12540698747158523863050715693290963295227443043557"
						+"66896648950445244523161731856403098711121722383113"
						+"62229893423380308135336276614282806444486645238749"
						+"30358907296290491560440772390713810515859307960866"
						+"70172427121883998797908792274921901699720888093776"
						+"65727333001053367881220235421809751254540594752243"
						+"52584907711670556013604839586446706324415722155397"
						+"53697817977846174064955149290862569321978468622482"
						+"83972241375657056057490261407972968652414535100474"
						+"82166370484403199890008895243450658541227588666881"
						+"16427171479924442928230863465674813919123162824586"
						+"17866458359124566529476545682848912883142607690042"
						+"24219022671055626321111109370544217506941658960408"
						+"07198403850962455444362981230987879927244284909188"
						+"84580156166097919133875499200524063689912560717606"
						+"05886116467109405077541002256983155200055935729725"
						+"71636269561882670428252483600823257530420752963450";
		
		int[] srs = convert(series);
		/*
		for(int i = 0; i < srs.length; i++){
			System.out.println(i +": " + srs[i]);
		}
		*/
		//System.out.println(findProd(srs));
		//System.out.println(mult(srs, 0, 3));
		long[] result = prodList(srs);
		/*
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
		*/
		System.out.println(findMax(result));
		//System.out.println(result);
	}

	public static int[] convert(String series){
		int len = series.length();
		int [] intSeries = new int[len];
		for(int i = 0; i < intSeries.length; i++){
			intSeries[i] = Integer.parseInt(series.substring(i, i+1));
		}
		return intSeries;
	}	

	public static long findMax(long [] list){
		long max = 0;
		for(int i = 0; i < list.length; i++){
			if(list[i] > max){
				max = list[i];
			}
		}
		return max;

	}
	
	public static long mult(int[] intList, int start, int end){
		long result = 1;
		for(int i = start; i < end; i++){
			result*=intList[i];
			//System.out.println(i);
		}
		return result;
	}

	public static long [] prodList(int[] intList){
		long [] products = new long[intList.length-1];
		for(int i = 0; i < products.length-13; i++){
			//System.out.println(i);
			products[i] = mult(intList, i, i + 13);
		}
		return products;
	}
}
						