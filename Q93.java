import java.math.BigInteger;
public class Q93 {
	public static void main(String[] args) {
		String num=BigInteger.valueOf(2).pow(1000).toString();
		int sum=0;
		char a[]=num.toCharArray();
		for(int i=0;i<a.length;i++) {
			sum+=Character.getNumericValue(a[i]);
		}
		System.out.println("Sum of digits: "+sum);
	}
}