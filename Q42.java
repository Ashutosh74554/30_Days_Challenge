public class Q42 {
	public static void main(String[] args) {
		for(int i=5;i>0;i--) {
			int j;
			for(j=0;j<i;j++) { 
				System.out.print("  ");
			}
			for(int k=1;k<=5;k++) {
				if(i==1 && k==1)
					System.out.print(1+"   ");
				if(i==2 && k==2)
					System.out.print(2+"   ");
				if((i%2==1 && i<5) && k==3)
					System.out.print(3+"   ");
				if((i%2==0 && i<6) && k==4)
					System.out.print(4+"   ");
				if(i%2==1 && k==5)
					System.out.print(5+"   ");
				else
					System.out.print("    ");
			}
			for(j=6;j<=9;j++) {
				if((i%2==0 && i<6) && j==6)
					System.out.print(6+"   ");
				else
					System.out.print("    ");
				if((i%2==1 && i<5) && j==7)
					System.out.print(7+"   ");
				if(i==2 && j==8)
					System.out.print(8);
				if(i==1 && j==9)
					System.out.print(9);
			}
			System.out.println();
		}
	}
}