import java.util.*;
public class Q74 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total terms: ");
		int n=sc.nextInt();
		System.out.println("Enter the values for "+n+" terms:");
		double a[]=new double[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextDouble();
		}
		sc.close();
		double sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+(1/a[i]);
		}
		double mean=n/sum;
		System.out.println("Harmonic mean: "+mean);
	}
}
