import java.util.*;
public class Q37 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of integers: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the integers:");
		for(int b=0;b<n;b++) {
			a[b]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<n-3;i++) {
			int first=Integer.parseInt(Integer.toBinaryString(a[i]));
			for(int j=i+1;j<n-2;j++) {
				int second=Integer.parseInt(Integer.toBinaryString(a[j]));
				for(int k=j+1;k<n-1;k++) {
					int third=Integer.parseInt(Integer.toBinaryString(a[k]));
					for(int l=k+1;l<n;l++) {
						int fourth=Integer.parseInt(Integer.toBinaryString(a[l]));
						if(((first^second)^(third^fourth))==0) {
							System.out.println("Yes");
							System.exit(-1);
						}
					}
				}
			}
		}
		System.out.println("No");
	}
}