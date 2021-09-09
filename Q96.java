import java.math.BigInteger;
public class Q96 {
	public static void main(String[] args) {
		BigInteger num=new BigInteger("1");
		BigInteger sum=new BigInteger("0");
		for(int i=1;i<=1000;i++) {
			num=BigInteger.valueOf(i).pow(i);
			sum=sum.add(num);
		}
		String str=new StringBuilder(""+sum).reverse().toString();
		String ans="";
		for(int i=0;i<10;i++) {
			ans=ans.concat(""+str.charAt(i));
		}
		String rev=new StringBuilder(ans).reverse().toString();
		System.out.println("Last 10 digits are: "+rev);
	}
}