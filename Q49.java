import java.util.*;
public class Q49 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k=n-i;k<n;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
