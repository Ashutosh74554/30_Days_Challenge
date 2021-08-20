import java.util.*;
public class Q14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range of numbers: ");
		int n=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=n) {
			if(i<=10) {
				System.out.print(i+" ");
				i++;
			}
			else break;
		}
		if(n>10) {
			int j=1;
			while(j<=(n-10)/2+1) {
				int num=j*10+(j+1);
				int rev=(j+1)*10+j;
				if(j==(n-10)/2+1 && n%2==1)
					System.out.print(num+" ");
				else if(j==(n-10)/2+1 && n%2==0)
					break;
				else 
					System.out.print(num+" "+rev+" ");
				j++;
			}
		}
	}
}