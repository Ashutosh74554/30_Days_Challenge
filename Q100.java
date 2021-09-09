public class Q100 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<1000000;i++) {
			if(palDecimal(i) && palBinary(i)) {
				sum+=i;
			}
		}
		System.out.println("Sum of all pallindrome numbers in base 10 and base 2: "+sum);
	}
	public static boolean palDecimal(int n) {
		int num=n;
		int rev=0;
		while(n>0) {
			rev= rev*10+ (n%10);
			n/=10;
		}
		if(rev==num)
			return true;
		else
			return false;
	}
	public static boolean palBinary(int n) {
		String s=Integer.toBinaryString(n);
		String rev=new StringBuilder(s).reverse().toString();
		if(s.equals(rev))
			return true;
		else
			return false;
	}
}