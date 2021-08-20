import java.util.*;
public class Q23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st array size: ");
		int n1=sc.nextInt();
		int ar1[]=new int[n1];
		System.out.println("Enter elements:");
		for(int i=0;i<n1;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.print("Enter 2nd array size: ");
		int n2=sc.nextInt();
		int ar2[]=new int[n2];
		System.out.println("Enter elements:");
		for(int i=0;i<n2;i++) {
			ar2[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Merged array:");
		for(int i=0, j=0; i<n1 && j<n2;i++,j++) {
			System.out.print(ar1[i]+" "+ar2[j]+" ");
		}
		if(n1!=n2) {
			if(n1>n2)
				System.out.println(ar1[n1-1]);
			else
				System.out.println(ar2[n2-1]);
		}
	}
}
