import java.util.*;
public class Q80 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 2 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int aBin[]=new int[32];
		int bBin[]=new int[32];
		int i=aBin.length-1;
		while(a>0) {
			aBin[i--]=a%2;
			a/=2;
		}
		i=bBin.length-1;
		while(b>0) {
			bBin[i--]=b%2;
			b/=2;
		}
		int oneA=0,oneB=0;
		for(int j=0;j<aBin.length;j++) {
			if(aBin[j]==1)
				oneA++;
		}
		for(int j=0;j<bBin.length;j++) {
			if(bBin[j]==1)
				oneB++;
		}
		if(oneA==oneB) {
			System.out.println("Anagrams");
		}
		else
			System.out.println("Not Anagrams");
	}
}