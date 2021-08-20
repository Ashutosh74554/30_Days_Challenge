import java.util.*;
public class Q13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total number of questions asked: ");
		int n=sc.nextInt();
		String ask[]=new String[n];
		String ans[]=new String[n];
		for(int i=1;i<=n;i++) {
			System.out.print("Enter asker's and coordinator's name for question "+i+": ");
			ask[i-1]=sc.next();
			ans[i-1]=sc.next();
		}
		sc.close();
		System.out.println("---------------------------------------------------------------");
		System.out.println("     Asker                                   Query solved by      ");
		System.out.println("    ---------                              -------------------    ");
		for(int i=0;i<n;i++) {
			System.out.print("     ");
			System.out.printf("%-45s%-10s%n",ask[i], ans[i]);
		}
		System.out.println("---------------------------------------------------------------");
	}
}
