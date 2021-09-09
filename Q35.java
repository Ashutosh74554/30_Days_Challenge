import java.util.*;
public class Q35 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the term: ");
		int n=sc.nextInt();
		sc.close();
		System.out.println("The Fibonnaci term is: "+fibo(n));
	}
	public static int fibo(int n) {
		int f[]=new int[n+1];
		if(n==0)
			return 0;
		if(n==1 || n==2)
			return (f[n]=1);
		if(f[n]!=0)
			return f[n];
		int k;
		if(n%2==1)
			k=(n+1)/2;
		else
			k=n/2;
		if(n%2==1)
			f[n]=(fibo(k)*fibo(k)+fibo(k-1)*fibo(k-1));
		else
			f[n]=(2*fibo(k-1)+fibo(k))*fibo(k);
		return f[n];
	}
}
