import java.util.*;
public class Q26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<(n/2)+1;i++) {
			if(i*(i+1)==n) {
				System.out.println(n+" is a Pronic number");
				System.exit(1);
			}
		}
		System.out.println(n+" is not a Pronic number");
	}
}
