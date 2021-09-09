import java.util.*;
public class Q47 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		String s=""+n;
		int x=s.length();
		System.out.println("Is Armstrong? "+armStrong(n,x));
	}
	public static boolean armStrong(int n, int x) {
		int rem[]=new int[x];
		int i=0,sum=0, temp=n;
		while(n>0) {
			rem[i++]=n%10;
			n/=10;
		}
		for(int j=0;j<x;j++) {
			sum+= Math.pow(rem[j], x);
		}
		if(sum==temp)
			return true;
		else
			return false;
	}
}
