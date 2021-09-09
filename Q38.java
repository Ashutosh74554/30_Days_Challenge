import java.util.*;
public class Q38 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of test cases: ");
		int t=sc.nextInt();
		int a[][]=new int[t][];
		for(int i=0;i<t;i++) {
			System.out.print("Enter array size: ");
			int n=sc.nextInt();
			a[i]=new int[n];
			System.out.println("Enter elements:");
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println();
		int sum=0,c=0;
		String s="",res="";
		for(int i=0;i<t;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum=0;
				c=0;
				s="";
				for(int k=j;k<a[i].length;k++) {
					sum=sum+ a[i][k];
					c++;
					s=s.concat(k+" ");
					if(sum%a[i].length==0) {
						res=s;
						System.out.println("Size of subset: "+c);
						System.out.println("Indices: "+res);
						break;
					}
					if(!(res.equals("")))
						break;
				}
			}
			if(s.equals("")) {
				System.out.println(-1);
			}
			System.out.println();
		}
	}
}