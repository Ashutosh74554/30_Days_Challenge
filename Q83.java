import java.util.*;
public class Q83 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		int b[]=new int[n];
		int c=0;
		for(int i=0;i<n-1;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[i]) {
					count++;
				}
			}
			if(count==a.length-i-1)
				b[c++]=a[i];
		}
		b[c]=a[n-1];
		System.out.println("Leaders in array:");
		for(int e:b) {
			if(e!=0)
				System.out.print(e+" ");
		}
	}
}