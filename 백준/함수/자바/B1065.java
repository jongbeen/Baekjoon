package function;

import java.util.Scanner;

public class B1065 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.print("숫자 입력하세요 :");
		int test = scanner.nextInt();
		int num = 0;
		int count = 0;
		while (num<=test) {
			if( checkHansu(num) == true) {
				count++;
				num++;
			}
			else
				num++;
			
		}
		System.out.println(count);
	}
	
	static boolean checkHansu(int num) {
		int[] table = new int[3];
		
		if (num <= 0) {
			return false;
		}
		else if (num<100) {
			return true;
		}
		else if (num < 1000) {
			int i=0;
			while (num >0) {
				table[i] = num % 10;
				i++;
				num /= 10;
			}
			int c1 = table[1] - table[0];
			int c2 = table[2] - table[1];
			if(c2 == c1)
				return true;
			else
				return false;
		}
		else {
			return false;
		}
	}
}
