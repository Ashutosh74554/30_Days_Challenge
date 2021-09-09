import java.util.*;
public class Q69 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=2;i<=n;i+=2) {
			if(n%i==0) 
				sum+=i;
		}
		System.out.println("Even factors sum: "+sum);
	}
}
