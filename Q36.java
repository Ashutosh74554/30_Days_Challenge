import java.util.*;
public class Q36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			System.out.print(cat(i)+" ");
		}
	}
	public static int cat(int n) {
		int a[]=new int[n+2];
		a[0]=1;
		a[1]=1;
		if(n==0 || n==1)
			return 1;
		for(int i=2;i<=n;i++) {
			a[i]=0;
			for(int j=0;j<i;j++)
				a[i]=a[i]+(a[j]*a[i-j-1]);
		}
		return a[n];
	}
}
