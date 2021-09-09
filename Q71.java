import java.util.*;
public class Q71 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=sc.nextInt();
		sc.close();
		int count=1;
		for(int i=1;i<=n;i++) {
			count=i;
			for(int j=1;j<=n;j++) {
				if(count==n) {
					System.out.print(count +" ");
					count=1;
				}
				else {
					System.out.print(count++ +" ");
				}
			}
			System.out.println();
		}
	}
}