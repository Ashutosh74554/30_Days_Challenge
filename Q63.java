import java.util.*;
public class Q63 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance travelled (metres): ");
		int n=sc.nextInt();
		sc.close();
		double fare=40;
		if(n>250) {
			n-=250;
			while(n>=200) {
				n-=200;
				fare+=2.50;
			}
		}
		fare+= (n*2.50)/200;
		System.out.println("Total fare: P"+fare);
	}
}
