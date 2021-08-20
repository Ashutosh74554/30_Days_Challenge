import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 1st point coordinates(top-left): ");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		
		
		System.out.println("Enter 2nd point coordinates(top-right): ");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		
		System.out.println("Enter 3rd point coordinates(bottom-left): ");
		double x3=sc.nextDouble();
		double y3=sc.nextDouble();
		
		System.out.println("Enter 4th point coordinates(bottom-right): ");
		double x4= sc.nextDouble();
		double y4=sc.nextDouble();
		
		sc.close();
		
		double s1=Math.abs(Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2)));
		double s2=Math.abs(Math.sqrt(Math.pow(x2-x4, 2)+Math.pow(y2-y4, 2)));
		
		double d1=Math.abs(Math.sqrt(Math.pow(x4-x1, 2)+Math.pow(y4-y1, 2)));
		double d2=Math.abs(Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2)));
		
		System.out.println();
		
		if((s1==s2 && d1==d2)) 
			System.out.println("Rectangle");
		else {
			System.out.println("Not a rectangle");
		}
	}

}
