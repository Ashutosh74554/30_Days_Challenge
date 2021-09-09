public class Q99 {
	public static void main(String[] args) {
		for(int i=2;i<1000000;i++) {
			if(cirPrime(i)) { 
				System.out.println(i);
			}
		}
	}
	public static boolean cirPrime(int n) {
		String s=""+n;
		int c=s.length();
		int num=n;
		while(prime(num)) {
			int p=num%10;
			int q=num/10;
			num=(int)((Math.pow(10, c-1))*p)+q;
			if(num==n)
				return true;
		}
			return false;
	}
	public static boolean prime(int n) {
		if(n<2)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}