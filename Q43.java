import java.util.*;
public class Q43 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number in decimal form: ");
		int n=sc.nextInt();
		sc.close();
		convert(n);
	}
	public static void convert(int n) {
		String bin="",oct="",hex="";
		int rem=0, x=n;
		while(n>0) {
			rem=n%2;
			bin+=rem;
			n/=2;
		}
		System.out.println("Binary equivalent:");
		for(int i=bin.length()-1;i>=0;i--) {
			System.out.print(bin.charAt(i)+" ");
		}
		rem=0; n=x;
		while(n>0) {
			rem=n%8;
			oct+=rem;
			n/=8;
		}
		System.out.println("\nOctal equivalent");
		for(int i=oct.length()-1;i>=0;i--) {
			System.out.print(oct.charAt(i)+" ");
		}
		rem=0; n=x;
		while(n>0) {
			rem=n%16;
			switch(rem) {
				case 10:
					hex+='A';
					break;
				case 11:
					hex+='B';
					break;
				case 12:
					hex+='C';
					break;
				case 13:
					hex+='D';
					break;
				case 14:
					hex+='E';
					break;
				case 15:
					hex+='F';
					break;
				default:
					hex+=rem;
			}
			n/=16;
		}
		System.out.println("\nHexadecimal equivalent:");
		for(int i=hex.length()-1;i>=0;i--) {
			System.out.print(hex.charAt(i)+" ");
		}
	}
}
