import java.util.*;
public class Q64 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the car number: ");
		int n=sc.nextInt();
		sc.close();
		String s=""+n;
		if(s.length()!=4 || n<=0) {
			System.out.println(n+" is not a valid car number!");
			System.exit(1);
		}
		int sum=0,rem=0;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		if((sum%3==0) || (sum%5==0) || (sum%7==0)) {
			System.out.println("Lucky number!!!");
		}
		else {
			System.out.println("Sorry its not my lucky number");
		}
	}
}
