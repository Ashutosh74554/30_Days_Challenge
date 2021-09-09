import java.util.*;
public class Q76 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of cuts: ");
		int n=sc.nextInt();
		sc.close();
		int x=((n*n)+n+2)/2;
		System.out.println("Maximum pieces formed: "+x);
	}
}