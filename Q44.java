import java.util.*;
public class Q44 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int x=n;
		sc.close();
		int ar[]=new int[32];
		int j=ar.length-1;
		while(n>0) {
			ar[j--]=n%2;
			n/=2;
		}
		int i=0;
		for(i=0;i<ar.length;i++) 
			if(ar[i]==1) 
				break;
		int binary[]=new int[ar.length-i];
		for(int k=0;k<binary.length;k++)
			binary[k]=ar[i++];
		System.out.println("Binary equivalent:");
		for(int e:binary) {
			System.out.print(e+" ");
		}
		int rev[]=new int[binary.length];
		for(int k=0, l=binary.length-1 ;k<binary.length;k++,l--) {
			rev[k]=binary[l];
		}
		boolean p=pallindrome(binary,rev);
		if(p)
			System.out.println("\nThe binary equivalent of "+x+" is pallindrome");
		else
			System.out.println("\nThe binary equivalent of "+x+" is not pallindrome");
	}
	public static boolean pallindrome(int binary[], int rev[]) {
		for(int i=0;i<rev.length;i++)
			if(rev[i]!=binary[i])
				return false;
		return true;
	}
}
