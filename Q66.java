public class Q66 {
	public static void main(String[] args) {
		int a=7,c=0;
		int b=6;
		for(int i=0;i<15;i++) {
			int p=a*i;
			c++;
			if(c==15) {
				System.out.println("\n15th term is: "+p);
				break;
			}
			System.out.print(p+" ");
			int q=b*i;
			System.out.print(q+" ");
			c++;
		}
	}
}