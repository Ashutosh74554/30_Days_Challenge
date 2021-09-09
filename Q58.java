import java.util.*;
public class Q58 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the roman number: ");
		String s=sc.next();
		String s1=s;
		sc.close();
		int n=0, i=0;
		s=s.toUpperCase();
		s=s.replaceAll("IV", "IIII");
		s=s.replaceAll("IX", "VIIII");
		s=s.replaceAll("XL", "XXXX");
		s=s.replaceAll("XC", "LXXXX");
		s=s.replaceAll("CD", "CCCC");
		s=s.replaceAll("CM", "DCCCC");
		for(i=0;i<s.length();i++) {
			n+=roman(s.charAt(i));
		}
		System.out.println("The integer value of "+s1+" is: "+n);
	}
	public static int roman(char s) {
		switch(s) {
			case 'M':
				return 1000;
			case 'D':
				return 500;
			case 'C':
				return 100;
			case 'L':
				return 50;
			case 'X':
				return 10;
			case 'V':
				return 5;
			case 'I':
				return 1;
		}
		return -1;
	}
}
