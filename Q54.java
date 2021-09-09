public class Q54 {
	public static void main(String[] args) {
		for(int i=0;i<6;i+=2) {
			for(int j=0;j<i-j;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<5-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i+=2) {
			for(int j=0;j<5-(i+3);j++) {
				System.out.print("  ");
			}
			for(int k=6-i;k<=5+2;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
