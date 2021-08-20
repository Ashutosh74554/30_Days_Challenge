public class Q10 {
	public static void main(String[] args) {
		int a,b,c, sum=1000;
		for(a=1;a<=sum/3;a++) {
			for(b=1;b<=sum/2;b++) {
				c=sum-a-b;
				if((a*a)+(b*b)==(c*c)) {
					System.out.println("Numbers are: "+a+" "+b+" "+c);
					System.out.println("Product: "+a*b*c);
				}
			}
		}
	}
}
