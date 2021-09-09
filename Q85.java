public class Q85 {
	public static void main(String[] args) {
		int c=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("   ");
			}
			c++;
			int count=1;
			for(int k=0;k<=5-c;k++) {
				System.out.print(count++ +"  ");
			}
			System.out.println();
		}
	}
}