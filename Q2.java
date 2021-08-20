import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lower bound: ");
		int l=sc.nextInt();
		System.out.print("Enter the upper bound: ");
		int u=sc.nextInt();
		sc.close();
		System.out.println("Partial sum: "+sum(l,u));
	}
	public static int sum(int l, int u) {
		int sum=0;
		for(int i=l;i<=u;i++) {
			int n=fibo(i);
			sum+=n;
			System.out.print(n+" ");
		}
		System.out.println();
		return sum;
	}
	public static int fibo(int n) {
		if(n==1 || n==0)
			return 0;
		if(n==2)
			return 1;
		else 
			return fibo(n-1)+fibo(n-2);
	}
}