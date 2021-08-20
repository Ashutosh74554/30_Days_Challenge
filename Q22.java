import java.util.*;
public class Q22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int n1=sc.nextInt();
		System.out.print("Enter number 2: ");
		int n2=sc.nextInt();
		sc.close();
		System.out.println("Result: "+mult(n1,n2));
	}
	public static int mult(int n1, int n2) {
		int res=0, i=0;
		while(n2>0) {
			if(n2%2!=0)
				res+=n1<<i;
			i++;
			n2/=2;
		}
		return res;
	}
}
