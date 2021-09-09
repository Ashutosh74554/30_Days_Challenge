import java.util.*;
public class Q30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			if(a>=0)
				a1.add(a);
			else
				a2.add(a);
		}
		sc.close();
		Object[] pos=a1.toArray();
		Object[] neg=a2.toArray();
		System.out.println("New Array:");
		for(Object e: pos)
			System.out.print(e+" ");
		for(Object o:neg) 
			System.out.print(o+" ");
	}
}
