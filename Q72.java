import java.util.*;
public class Q72 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<>();
		System.out.println("Enter elements (-1 to finish):");
		while(true) {
			int input=sc.nextInt();
			if(input==-1)
				break;
			a.add(input);
		}
		Object[] arr=a.toArray();
		int[] index=new int[arr.length];
		System.out.println("Enter corresponding indices:");
		for(int i=0;i<arr.length;i++) {
			index[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(index[j]==i) {
					int temp=(int)arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("After ordering by indices:");
		for(Object e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
		for(int k=0;k<arr.length;k++) {
			System.out.print(k+" ");
		}
	}
}
