import java.util.*;
public class Q12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n1=sc.nextInt();
		int a[]=new int[32];
		int ar[]=new int[32];
		int p=0,i=a.length-1;
		sc.close();
		while(n1>0) {
			p=n1%2;
			n1/=2;
			a[i--]=p;
		}
		System.out.println("Binary equivalent:");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
			ar[j]=a[j]^1;
		}
		System.out.println("\n1's complement");
		for(int j=0;j<ar.length;j++)
			System.out.print(ar[j]+" ");
		System.out.println();
		twos(a);
	}
	public static void twos(int res[]) {
		int n=res.length;
		int i;
		for(i=n-1;i>=0;i--) 
			if(res[i]==1)
				break;
		for(int k=i-1;k>=0;k--) {
			if(res[k]==1)
				res[k]=0;
			else
				res[k]=1;
		}
		System.out.println("2's complement:");
		for(int j=0;j<res.length;j++)
			System.out.print(res[j]+" ");
	}
}
