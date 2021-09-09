import java.util.*;
public class Q57 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		String binary=Integer.toBinaryString(n);
		int count=0;
		for(int i=0;i<binary.length();i++) {
			if(binary.charAt(i)=='1')
				count++;
		}
		System.out.println("Total '1' bits present in the binary value of "+n+" is: "+count);
	}
}
