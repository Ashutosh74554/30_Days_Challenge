import java.util.*;
public class Q51 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		int i=n+1;
		while(true) {
			boolean pal=pallindrome(i);
			if(pal) {
				System.out.println("Next smallest pallindrome: "+i);
				System.exit(0);
			}
			else
				i++;
		}
	}
	public static boolean pallindrome(int n) {
		int num=n;
		int rem=0,rev=0;
		while(n>0) {
			rem=n%10;
			rev= rev*10 +rem;
			n/=10;
		}
		if(num==rev)
			return true;
		return false;
	}
}
