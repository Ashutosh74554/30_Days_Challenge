public class Q92 {
	public static void main(String[] args) {
		long sumSquare=0,sum=0;
		for(int i=1;i<=100;i++) {
			sumSquare+=Math.pow(i, 2);
			sum+=i;
		}
		long squareSum=(long)Math.pow(sum, 2);
		System.out.println("Difference: "+Math.abs(sumSquare-squareSum));
	}
}