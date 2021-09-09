import java.util.*;
public class Q46 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a,b and c: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		sc.close();
		double d=(b*b)-(4*a*c);
		if(d==0) {
			double root= (-b+ Math.sqrt(d))/(2*a);
			System.out.println(root);
		}
		if(d>0) {
			double root1= (-b + Math.sqrt(d))/(2*a);
			double root2= (-b - Math.sqrt(d))/(2*a);
			System.out.println(root1);
			System.out.println(root2);
		}
		else {
			String r1= (-b/(2*a))+" + i "+(Math.sqrt(-d)/(2*a));
			String r2= (-b/(2*a))+" - i "+(Math.sqrt(-d)/(2*a));
			System.out.println(r1.substring(0, r1.lastIndexOf('.')+3));
			System.out.println(r2.substring(0, r2.lastIndexOf('.')+3));
		}
	}
}
