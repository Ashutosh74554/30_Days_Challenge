import java.util.*;
public class Q81 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		if(n%2==0) {
			int sumLeft=0,sumRight=0;
			for(int i=0;i<n/2;i++) {
				sumLeft+=a[i];
			}
			for(int j=n/2;j<n;j++) {
				sumRight+=a[j];
			}
			System.out.println("Minimum addition: "+Math.abs(sumRight-sumLeft));
		}
		else {
			int sumLeft=0,sumRight=0;
			for(int i=0;i<=n/2;i++) {
				sumLeft+=a[i];
			}
			for(int j=n/2;j<n;j++) {
				sumRight+=a[j];
			}
			System.out.println("Minimum addition: "+Math.abs(sumRight-sumLeft));
		}
	}
}