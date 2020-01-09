package function;

public class B4673 {
	public static void main(String[] args) {
		boolean[] check_table = new boolean[10001];
		
		for(int i=1; i<=10000; ++i) {
			int index = divSum(i);
			if(index<=10000) {
				check_table[index] = true;
			}
		}
		for(int i=1; i< check_table.length;i++) {
			if(!check_table[i]) {
				System.out.println(i);
			}
		}
		
	}
	
	public static int divSum(int num) {
		int sum = num;
		while (num >0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
