import java.util.*;
public class Q90 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the integer: ");
		int n=sc.nextInt();
		sc.close();
		int rev=0,rem=0,k=0;
		if(n<0) {
			k=n;
			n=n*-1;
		}
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(k<0)
			System.out.println("Reverse: -"+rev);
		else
			System.out.println("Reverse: "+rev);
	}
}