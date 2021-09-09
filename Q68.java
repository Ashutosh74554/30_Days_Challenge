import java.util.*;
public class Q68 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the position to split: ");
		int q=sc.nextInt();
		sc.close();
		for(int i=0;i<q;i++) {
			int temp=a[0];
			for(int j=1;j<n;j++) {
				a[j-1]=a[j];
			}
			a[n-1]=temp;
		}
		System.out.println("After splitting:");
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
}