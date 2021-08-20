import java.util.*;
public class Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		System.out.print("Enter the 2 bits(index) you want to swap: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.close();
		n^=1<<x;
		n^=1<<y;
		System.out.println("After swapping bits, the new number: "+n);
	}
}
