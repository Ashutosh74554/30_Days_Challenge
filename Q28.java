import java.util.*;;
public class Q28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int i=0;
		sc.close();
		System.out.println("The series is:");
		for(int k=1;k<=n;k++) {
			int a=(int)Math.pow(k, n-i);
			System.out.print(a+" ");
			i++;
		}
	}

}
