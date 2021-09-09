import java.util.*;
public class Q62 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many integers you want to check: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		boolean p,q;
		int b[]=new int[n], in=0;
		for(int i=0;i<n;i++) {
			p=pp(a[i]);
			if(p) {
				q=pp(a[i], (int)Math.sqrt(a[i]));
				if(q) {
					b[in++]=a[i];
				}
			}
			else
				continue;
		}
		System.out.println("Prime-pallindrome numbers are:");
		for(int e:b) {
			if(e!=0)
				System.out.print(e+" ");
		}
	}
	public static boolean pp(int n) {
		int rev=0,num=n,rem=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(rev==num)
			return true;
		else 
			return false;
	}
	public static boolean pp(int n, int x) {
		for(int i=2;i<=x;i++) {
			if(n%i==0) {
				return false;
			}
			else
				continue;
		}
		return true;
	}
}