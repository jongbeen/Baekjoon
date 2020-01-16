package Strings;

import java.util.Scanner;

public class S5_B1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input = input.toUpperCase();
		
		int[] cnt = new int[26];
		int max = 0;
		char result ='?';
		
		for (int i=0; i<input.length();i++) {
			cnt[input.charAt(i)-65]++;
			if(max<cnt[input.charAt(i)-65]) {
				max = cnt[input.charAt(i)-65];
				result = input.charAt(i);
			}
			else if(max == cnt[input.charAt(i)-65]) {
				result = '?';
			}
		}
		System.out.println(result);	
	}
}
