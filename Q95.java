public class Q95 {
	public static void main(String[] args) {
		long num=2000000;
		long sum=0;
		for(long i=2;i<num;i++) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		System.out.println("Sum of prime numbers below 2 million: "+sum);
	}
	public static boolean isPrime(long n) {
		for(long i=2;i<=(long)Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}