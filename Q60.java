import java.util.*;
public class Q60 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row and column size of 1st matrix: ");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int mat1[][]=new int[r1][c1];
		System.out.print("Enter the row and column size of 2nd matrix: ");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int mat2[][]=new int[r2][c2];
		if(c1!=r2) {
			System.out.println("Column size of 1st matrix and Row size of 2nd matrix must be equal!!!");
		}
		else {
			int prod[][]=new int[r1][c2];
			System.out.println("Enter the elements of 1st matrix:");
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					mat1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the elements of 2nd matrix:");
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c2;j++) {
					mat2[i][j]=sc.nextInt();
				}
			}
			sc.close();
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					for(int k=0;k<r2;k++) {
						prod[i][j]+=mat1[i][k]*mat2[k][j];
					}
				}
			}
			System.out.println("Product matrix:");
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++)
					System.out.print(prod[i][j]+" ");
				System.out.println();
			}
		}		
	}
}
