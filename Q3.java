import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter min value: ");
		long min=sc.nextLong();
		System.out.print("Enter max value: ");
		long max=sc.nextLong();
		sc.close();
		getPiFrac(min,max);
	}
	public static void getPiFrac(long min, long max) {
		double n=min*3;
		double d=min;
		for(long i=min;i<=max;i++) {
			double left=Math.floor(Math.PI*i);
			double right= left+1;
			if(Math.abs(left/i-Math.PI) < Math.abs(n/d-Math.PI)){
				n=left;
				d=i;
			}
			if(Math.abs(right/i-Math.PI) < Math.abs(n/d-Math.PI)) {
				n=right;
				d=i;
			}
		}
		System.out.println((int)n+"/"+(int)d);
	}
}
