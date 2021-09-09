import java.util.*;
public class Q82 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the binary bits:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		if(a[0]==1) {
			System.out.println(-1);
			System.exit(-1);
		}
		else {
			int i=0;
			while(i<a.length) {
				if(a[i]==1) {
					System.out.println("Transition point: "+i);
					System.exit(0);
				}
				i++;
			}
			System.out.println(-1);
		}
	}
}