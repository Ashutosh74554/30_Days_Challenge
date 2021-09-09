import java.util.*;
public class Q77 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		sc.close();
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(Math.abs(a[i]-a[j])==num) {
					System.out.println(a[i]+" and "+a[j]+" has difference of "+num);
					System.exit(1);
				}
				else
					continue;
			}
		}
	}
}