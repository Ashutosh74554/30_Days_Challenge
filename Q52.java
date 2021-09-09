import java.util.*;
public class Q52 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.print("C");
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			System.out.print("W");
			for(int l=1;l<i;l++) {
				System.out.print(" ");
			}
			System.out.println("C");
		}
	}
}
