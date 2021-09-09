import java.util.*;
public class Q73 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the angle: ");
		float n=sc.nextFloat();
		sc.close();
		float error= 0.000001f;
		float sin, sinReal;
	    n = n * (float)(3.142 / 180.0);
	    float x = n;
	    sin = n;        
	    sinReal = (float)Math.sin(n);    
	    int i = 1;
	    do
	    {
	        x = -x * n * n / (2 * i * (2 * i + 1));
	        sin+=x;
	        i++;
	    } while (error <= sinReal - sin);
	       System.out.println("Result: "+sin);
	}
}
