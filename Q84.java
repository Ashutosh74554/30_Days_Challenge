public class Q84 {
	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=5;i++) {
			count=1;
			for(int j=5;j>=i;j--) {
				System.out.print("   ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(count++ +"     ");
			}
			System.out.println();
		}
	}
}