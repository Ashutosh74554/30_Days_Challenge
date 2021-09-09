import java.util.*;;
public class Q32 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the two numbers: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.close();
		long nFact=fact(n);
		long mFact=fact(m);
		long res=nFact/(mFact*fact(n-m));
		System.out.println("Binomial coefficient: "+res);
	}
	public static long fact(int k) {
		if(k==1)
			return 1;
		if(k==0)
			return 0;
		else
			return k*fact(k-1);
	}
}