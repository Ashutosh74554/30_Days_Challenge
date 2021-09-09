import java.util.*;
public class Q56 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		int sum=0,rem=0;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		int sumFin=0, remFin=0;
		while(sum>=10) {
			while(sum>0) {
				remFin=sum%10;
				sumFin+=remFin;
				sum/=10;
			}
		}
		if(sumFin==1 || sumFin==10 || sumFin==100 || sum==1)
			System.out.println("Magic number");
		else
			System.out.println("Not a magic number");
	}
}
