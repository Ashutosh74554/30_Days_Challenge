import java.util.*;
public class Q39 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of test cases: ");
		int t=sc.nextInt();
		int a[][]=new int[t][];
		for(int i=0;i<t;i++) {
			int j=0;
			System.out.print("Enter lower and upper bound: ");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			a[i]=new int[n2-n1+1];
			for(int k=n1;k<=n2;k++) {
				boolean x=isPrime(k);
				if(x==true)
					a[i][j++]=k;
			}
		}
		sc.close();
		for(int i=0;i<t;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]!=0 && a[i][j]!=1)
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
