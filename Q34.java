import java.util.*;
public class Q34 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter 1st array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd array:");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(int k=0;k<n-i-1;k++) {
				if(b[k]<b[k+1]) {
					int temp=b[k];
					b[k]=b[k+1];
					b[k+1]=temp;
				}
			}
		}
		int dotProd=0;
		for(int i=0;i<n;i++) {
			dotProd+= a[i]*b[i];
		}
		System.out.println(dotProd);
	}
}