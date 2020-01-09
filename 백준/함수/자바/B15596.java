package function;

public class B15596 {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println(sum(a));
		
	}
	
	static long sum(int[] a) {
		long ans = 0;
		for( int i=0; i<a.length;i++) {
			ans += a[i];
		}
		return ans;
	}

}
