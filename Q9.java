import java.math.BigInteger;
public class Q9 {
	public static void main(String[] args) {
		BigInteger fact=new BigInteger("1");
		int sum=0;
		for(int i=2;i<=100;i++)
			fact=fact.multiply(BigInteger.valueOf(i));
		String s=fact.toString();
		for(int j=0;j<s.length();j++) {
			sum+=Integer.parseInt(s.charAt(j)+"");
		}
		System.out.println("Sum of digits in 100! is: "+sum);
	}
}
