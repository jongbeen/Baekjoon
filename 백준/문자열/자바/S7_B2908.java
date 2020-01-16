package Strings;

import java.util.Scanner;

public class S7_B2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test1 = sc.next();
		String test2 = sc.next();
		StringBuffer input1 = new StringBuffer(test1);
		StringBuffer input2 = new StringBuffer(test2);
		
		input1 = input1.reverse();
		input2 = input2.reverse();
		
		int a = Integer.parseInt(input1.toString());
		int b = Integer.parseInt(input2.toString());
		
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);	
	}
}
