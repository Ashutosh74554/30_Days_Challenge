import java.util.*;
public class Q11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total no. of paths you want to compare for: ");
		int n=sc.nextInt();
		int xi[]=new int[n];
		int yi[]=new int[n];
		int xf[]=new int[n];
		int yf[]=new int[n];
		double dist[]=new double[n];
		for(int i=0;i<n;i++) {
			System.out.println("\nEnter the constraints for path "+(i+1));
			System.out.print("Enter X and Y coordinates of Initial position: ");
			xi[i]=sc.nextInt();
			yi[i]=sc.nextInt();
			System.out.print("Enter X and Y coordinates of Final position: ");
			xf[i]=sc.nextInt();
			yf[i]=sc.nextInt();
		}
		sc.close();
		System.out.println();
		double min=Double.MAX_VALUE;
		for(int j=0;j<n;j++) {
			dist[j]=Math.abs(Math.sqrt(Math.pow(xf[j]-xi[j], 2)+Math.pow(yf[j]-yi[j], 2)));
			if(dist[j]<min)
				min=dist[j];
			System.out.println(dist[j]+" will be covered in path "+(j+1));
		}
		for(int i=0;i<n;i++)
			if(min==dist[i])
		System.out.println("\nYou should go with path "+(i+1));
	}

}
