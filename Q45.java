import java.util.*;
public class Q45 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		int a[]=new int[32], k=a.length-1;
		int zero=0,one=0;
		while(n>0) {
			int p=n%2;
			a[k--]=p;
			n/=2;
		}
		System.out.println("Binary equivalent:");
		for(int e:a) {
			System.out.print(e+" ");
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==0)
				zero++;
			else
				one++;
		}
		int b[]=new int[32],count=0;
		for(int i=0;i<zero;i++) {
			b[count++]=0;
		}
		for(int i=0;i<one;i++) {
			b[count++]=1;
		}
		int num=0,c=0;
		for(int i=b.length-1;i>=0;i--) {
			num+=(b[i]*Math.pow(2, c++));
		}
		System.out.println("\nMinimum value after swapping bits: "+num);	
	}
}