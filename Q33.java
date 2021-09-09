import java.util.Scanner;
public class Q33 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of sections: ");
		int t=sc.nextInt();
		int a[][]=new int[t][];
		for(int i=0;i<t;i++) {
			System.out.print("Enter number of papers: ");
			int n=sc.nextInt();
			a[i]=new int[n];
			System.out.println("Enter marks:");
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println();
		for(int i=0;i<t;i++) {
			sort(a[i]);
		}
	}
	public static void sort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printArr(arr);
	}
	public static void printArr(int a[]) {
		for(int e:a) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
}