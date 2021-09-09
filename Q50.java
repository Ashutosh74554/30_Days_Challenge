import java.util.*;
public class Q50 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st integer: ");
		int n1=sc.nextInt();
		System.out.print("Enter 2nd integer: ");
		int n2=sc.nextInt();
		sc.close();
		int c=0;
		for(int i=n1+1;i<n2;i++) {
			if(isPrime(i))
				c++;
		}
		System.out.println("Total number of primes: "+c);
	}
	public static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}