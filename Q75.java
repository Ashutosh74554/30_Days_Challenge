import java.util.*;
public class Q75 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the nuumber: ");
		int n=sc.nextInt();
		sc.close();
		int fact=1;
		for(int i=n;i>0;i-=2) {
			fact=fact*i;
		}
		System.out.println("Double factorial ("+n+"!!): "+fact);
	}
}
