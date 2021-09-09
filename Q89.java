import java.util.*;
public class Q89 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=sc.nextInt();
		sc.close();
		if(n%2!=0) {
			int[][] square=new int[n][n];
			int i=n/2, j=n-1,count=1;
			while(count<n*n){
				if(i==-1 && j==n) {
					j=n-2;
					i++;
				}
				else {
					if(j==n && i!=-1)
						j=0;
					if(i<0)
						i=n-1;
				}
				if(square[i][j]!=0) {
					j-=2;
					i++;
					continue;
				}
				else
					square[i][j]=count++;
				j++;i--;
			}
			for(int c=0;c<n;c++) {
				for(int c1=0;c1<n;c1++) {
					if(square[c][c1]/10==0)
						System.out.print(square[c][c1]+"  ");
					else
						System.out.print(square[c][c1]+" ");
				}
				System.out.println();
			}
		}
		if(n%2==0) {
			int a[][]=new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++)
					a[i][j]=n*i +j+1;
			}
			for(int i=0;i<n/4;i++) {
				for(int j=0;j<n/4;j++)
					a[i][j]=(int)(Math.pow(n, 2)+1)-a[i][j];
			}
			for(int i=0;i<n/4;i++) {
				for(int j=3*n/4;j<n;j++)
					a[i][j]=(int)(Math.pow(n, 2)+1)-a[i][j];
			}
			for(int i=3*n/4;i<n;i++) {
				for(int j=0;j<n/4;j++)
					a[i][j]=(int)(Math.pow(n, 2)+1)-a[i][j];
			}
			for(int i=3*n/4;i<n;i++) {
				for(int j=3*n/4;j<n;j++)
					a[i][j]=(int)(Math.pow(n, 2)+1)-a[i][j];
			}
			for(int i=n/4;i<3*n/4;i++) {
				for(int j=n/4;j<3*n/4;j++)
					a[i][j]=(int)(Math.pow(n, 2)+1)-a[i][j];
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(a[i][j]/10==0)
						System.out.print(a[i][j]+"  ");
					else
						System.out.print(a[i][j]+" ");
				}
				System.out.println();	
			}
		}
	}
}