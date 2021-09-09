import java.util.*;
public class Q24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			if(a%2==0)
				a1.add(a);
			else
				a2.add(a);
		}
		sc.close();
		Object[] even=a1.toArray();
		Object[] odd=a2.toArray();
		System.out.println("New Array:");
		for(Object e: even)
			System.out.print(e+" ");
		for(Object o:odd)
			System.out.print(o+" ");

	}
}
