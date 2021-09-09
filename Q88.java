import java.util.*;
public class Q88 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lower and upper bound: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int res= (int) (((Math.random())*(b-a+1)) + a);
		System.out.println("Random integer in the range: "+res);
	}
}