
public class Linear_Search {

	public static void main(String[] args) {
		int i;
		int a[]= {3,4,5,6};
		int target=5;
		int extra=-1;
		for(i=0;i<a.length;i++) {
			if(a[i]==target) {
				System.out.println("Index number :"+i);
				break;
			}
		}
		if(i==a.length)
			System.out.println("no");
		else 
			System.out.println("yes");

	}

}
