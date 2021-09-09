public class Q97 {
	public static void main(String[] args) {
		int a[]= {1,2,5,10,20,50,100,200};
		int sum=200;
		int curr[]=new int[sum+1];
		curr[0]=1;
		for(int i=0;i<a.length;i++) {
			for(int j=a[i];j<=sum;j++) {
				curr[j]+= curr[j -a[i]];
			}
		}
		System.out.println("Total ways to form currency of 200 is: "+curr[curr.length-1]);
	}
}