import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of integers: ");
		int n=sc.nextInt();
		sc.close();
		System.out.println("Number of ways to arrange: "+countWays(n));
	}
	public static int countWays(int n) {
		if(n==0 || n==1)
			return 0;
		if(n==2)
			return 1;
		else
			return (n-1)*(countWays(n-1)+countWays(n-2));
	}
}
