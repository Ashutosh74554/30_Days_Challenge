import java.util.*;
public class Q65 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		String s=""+n;
		char a1[]=new char[s.length()];
		char a2[]=new char[a1.length];
		for(int i=0;i<s.length();i++) {
			a1[i]=s.charAt(i);
			a2[i]=s.charAt(i);
		}
		for(int i=0;i<a1.length;i++) {
			char c=a1[i];
			for(int j=i+1;j<a2.length;j++) {
				if(c==a2[j]) {
					System.out.println("Not a unique number");
					System.exit(1);
				}
				else
					continue;
			}
		}
		System.out.println("Unique number");
	}
}
