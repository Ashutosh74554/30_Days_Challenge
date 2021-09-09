import java.util.*;
public class Q70 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=2;i<=(int)Math.sqrt(n);i++) {
			while(n%i==0) {
				sum+=i;
				n/=i;
			}
		}
		sum=sum+n;
		System.out.println("Minimum sum of factors: "+sum);
	}
}
