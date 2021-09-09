import java.util.*;
public class Q61 {
	static double squareRoot(double n) 
	{	
		double x = n;
		double root=2;
		double res; 
		while (true) 
		{
			res = 0.5 * (x + (n / x)); 
			if (Math.abs(res-x)<root) 
				break; 
			x=res; 
		} 
		return res; 
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		double n = sc.nextDouble();
		sc.close();
		System.out.println("Square root of "+n+" is nearly equal to: "+squareRoot (n));
	}
}