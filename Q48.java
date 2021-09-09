import java.util.*;
public class Q48 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base: ");
		int b=sc.nextInt();
		System.out.print("Enter the exponent: ");
		int e=sc.nextInt();
		sc.close();
		int res=1;
		while(e>0) {
			if((e & 1)==1) {
				res= mult(res,b);
			}
			b=mult(b,b);
			e=e>>1;
		}
		System.out.println("Result: "+res);
	}
	static int mult(int a,int b) {
		int res=0;
		while(b>0) {
			if((b&1)==1) 
				res+=a;
			a=a<<1;
			b=b>>1;
			
		}
		return res;
	}
}
