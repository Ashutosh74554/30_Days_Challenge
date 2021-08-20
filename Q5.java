import java.util.*;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter coordinates for 1st rectangle:");
		System.out.print("Top left: ");
		double r1_tlx=sc.nextDouble();
		double r1_tly=sc.nextDouble();
		System.out.print("Bottom left: ");
		double r1_blx=sc.nextDouble();
		double r1_bly=sc.nextDouble();
		System.out.print("Top right: ");
		double r1_trx=sc.nextDouble();
		double r1_try=sc.nextDouble();
		System.out.print("Bottom right: ");
		double r1_brx=sc.nextDouble();
		double r1_bry=sc.nextDouble();
		System.out.println();
		
		System.out.println("Enter coordinates for 2nd rectangle:");
		System.out.print("Top left: ");
		double r2_tlx=sc.nextDouble();
		double r2_tly=sc.nextDouble();
		System.out.print("Bottom left: ");
		double r2_blx=sc.nextDouble();
		double r2_bly=sc.nextDouble();
		System.out.print("Top right: ");
		double r2_trx=sc.nextDouble();
		double r2_try=sc.nextDouble();
		System.out.print("Bottom right: ");
		double r2_brx=sc.nextDouble();
		double r2_bry=sc.nextDouble();
		sc.close();
		System.out.println();
		
		//Intersection of R1 top left and R2 bottom right
		if(r2_brx>r1_tlx && (r1_tly>r2_bry && r2_try>r1_tly))
			System.out.println("Intersecting");
				
		//Intersection of R1 top right and R2 bottom left
		else if(r1_trx>r2_blx && (r2_tly>r1_try && r2_bly<r1_try))
			System.out.println("Intersecting");
				
		//Intersection of R1 bottom left and R2 top right
		else if(r2_trx>r1_blx && (r2_try>r1_bly && r2_bry<r1_bly))
			System.out.println("Intersecting");
				
		//Intersection of R1 bottom right and R2 top left
		else if(r1_brx>r2_tlx && (r2_tly>r1_bry && r2_bly<r1_bry))
			System.out.println("Intersecting");
				
		//Intersection of R1 top left and R2 top right
		else if(r2_trx>r1_tlx && (r2_bry<r1_tly && r2_try>r1_bly))
			System.out.println("Intersecting");
				
		//Intersection of R1 top right and R2 top left
		else if(r1_trx>r2_tlx && (r1_try>r2_bly && r1_bry<r2_tly))
			System.out.println("Intersecting");
				
		//Intersection of R1 bottom left and R2 bottom right
		else if(r2_brx>r1_blx && (r2_try>r1_bly && r1_tly>r2_bry))
			System.out.println("Intersecting");
				
		//Intersection of R1 bottom right and R2 bottom left
		else if(r1_brx>r2_blx && (r2_tly>r1_bry && r2_bly<r1_try))
			System.out.println("Intersecting");
				
		else
			System.out.println("Not intersecting");
	}
}
