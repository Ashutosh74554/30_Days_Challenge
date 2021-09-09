import java.util.*;
public class Q25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int a[]=new int[32];
		int p=0,i=a.length-1;
		while(n>0) {
			p=n%2;
			n/=2;
			a[i--]=p;
		}
		System.out.println("Binary equivalent:");
		for(int j=0;j<a.length;j++) 
			System.out.print(a[j]+" ");
		System.out.print("\nEnter the bit you want to toggle: ");
		int k=sc.nextInt();
		a[k]=a[k]^1;
		sc.close();
		System.out.println("After toggle:");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		i=0;
		int sum=0;
		for(int j=a.length-1;j>=0;j--) 
			sum+=Math.pow(2, i++)*a[j];
		System.out.println("\nDecimal equivalent: "+sum);
	}
}
