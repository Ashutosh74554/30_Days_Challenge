public class Q98 {
	public static void main(String[] args) {
		long sum=0,sumFactorian=0;
		for(int i=1;i<50000;i++) {
			sum=0;
			int a=i;
			while(a>0) {
				int n=a%10;
				sum+= fact(n);
				a/=10;
			}
			if(sum==i) {
				System.out.print(i+" ");
				sumFactorian+=i;
			}
		}
		System.out.println("\nSum of factorian numbers: "+sumFactorian);
	}
	public static long fact(long n) {
		if(n==1 || n==0)
			return 1;
		else
			return n*fact(n-1);
	}
}