import java.util.*;
public class Q29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n=sc.nextInt();
		int num=0;
		double sum=0;
		sc.close();
		for(int i=0;i<n;i++) {
			num=num*10+5;
			String s="0."+num;
			System.out.print(s+", ");
			sum= sum+Double.parseDouble(s);
		}
		System.out.println("\nSum: "+sum);
	}
}
