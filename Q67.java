import java.util.*; 
public class Q67 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sizes of 3 arrays: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int a[]=new int[n1], b[]=new int[n2], c[]=new int[n3];
		System.out.println("Enter elements of 1st array:");
		for(int i=0;i<n1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter elements of 2nd array:");
		for(int i=0;i<n2;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("Enter elements of 3rd array:");
		for(int i=0;i<n3;i++) {
			c[i]=sc.nextInt();
		}
		sc.close();
		int min1=Math.min(n1, n2);
		int min=Math.min(min1, n3);
		int inter[]=new int[min];
		int count=0;
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				for(int k=0;k<n3;k++) {
					if(a[i]==b[j] && b[j]==c[k])
						inter[count++]=a[i];
				}
			}
		}
		System.out.println("Common elements:");
		for(int e:inter) {
			if(e!=0)
			System.out.print(e+" ");
		}
	}
}
