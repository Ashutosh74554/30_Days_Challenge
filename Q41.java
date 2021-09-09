import java.util.*;
public class Q41 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array and the number: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=0;
			for(int j=i;j<n;j++) {
				sum+=a[j];
				if(sum%m==0 || m%sum==0) {
					System.out.println("Yes");
					System.exit(1);
				}
			}
		}
		System.out.println("No");
	}
}