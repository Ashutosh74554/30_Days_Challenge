import java.util.*;;
public class Q59 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		System.out.print("Enter number of rotations: ");
		int p=sc.nextInt();
		System.out.print("Enter number of queries: ");
		int q=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter queries: ");
		int queries[]=new int[q];
		for(int i=0;i<q;i++) {
			queries[i]=sc.nextInt();
		}
		sc.close();
		rotate(a,p,n);
		for(int i=0;i<n;i++) {
			if(i==queries[i]) {
				System.out.println(a[i]);
			}
		}
	}
	public static void rotate(int a[], int p, int n) {
		rev(a,0,n-1);
		rev(a,0,p-1);
		rev(a,p,n-1);
	}
	public static void rev(int ar[], int a, int b) {
		for(int i=a,j=b;i<j;i++,j--) {
			int temp=ar[a];
			ar[a]=ar[b];
			ar[b]=temp;
		}
	}
}