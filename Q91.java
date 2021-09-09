public class Q91 {
	public static void main(String[] args) {
		long num=600851475143L;
		long max=0;
		for(long i=3;i<Math.sqrt(num);i+=2) {
			if(num%i==0) {
				if(isPrime(i))
					max=i;
			}
		}
		System.out.println("Largest prime factor: "+max);
	}
	public static boolean isPrime(long n) {
		for(long i=2;i<Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}