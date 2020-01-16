package Strings;

import java.util.Scanner;

public class S8_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int[] number = new int[26];
		int count=0;
		//5<x<=8, 14<x<=18, else로 더 코드 줄일수 있음
		while(count<=25) {
			if (count<=2) { 
				number[count] = 2;
			}
			else if (count<=5) {
				number[count] = 3;
			}
			else if (count<=8) {
				number[count] = 4;
			}
			else if (count<=11) {
				number[count] = 5;
			}
			else if (count<=14) {
				number[count] = 6;
			}
			else if (count<=18) {
				number[count] = 7;
			}
			else if (count<=21) {
				number[count] = 8;
			}
			else if (count<=25) {
				number[count] = 9;
			}
			count++;
		}
		int sum=0;
		for(int i=0; i<input.length();i++) {
			sum += number[input.charAt(i)-65]+1;
		}
		System.out.println(sum);
	}
}
