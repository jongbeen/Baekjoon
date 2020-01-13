package Strings;

import java.util.Scanner;

public class B11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int count =0;
		int sum=0;
		cnt = sc.nextInt();
		if(cnt<1 || cnt >100) {
			return;
		}
		String value = sc.next();
		for(int i=0;i<value.length();i++) {
			int n = value.charAt(i);
			sum += n-48;	
			count++;
		}
		if(count != cnt) {
			return;
		}
		System.out.println(sum);	
	}
}
