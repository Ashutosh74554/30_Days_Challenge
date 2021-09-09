public class Q94 {
	public static void main(String[] args) {
		long i=21;
		while(true) {
			if(isDivisible(i)) {
				System.out.println("Smallest number: "+i);
				System.exit(1);
			}
			i++;
		}
	}
	public static boolean isDivisible(long n) {
		for(int i=2;i<=20;i++) {
			if(n%i!=0)
				return false;
		}
		return true;
	}
}