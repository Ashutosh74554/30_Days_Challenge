import java.util.*;
public class Q53 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n=sc.nextInt();
		sc.close();
		int i=1;
		for(i=1;i<=n/2;i++) {
			if(i!=n/2 || n%2==1)
				System.out.print((i*i)+", "+(i*i*i)+", ");
			else
				System.out.print((i*i)+", "+(i*i*i));
		}
		if(n%2==1) 
			System.out.println(i*i);
	}
}
