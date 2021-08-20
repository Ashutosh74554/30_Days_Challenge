import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side of square: ");
		double side=sc.nextInt();
		sc.close();
		double radius=side/2;
		System.out.println("Area of cricle inside the square: "+(3.14*radius*radius));
	}
}
