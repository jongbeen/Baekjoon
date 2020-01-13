package Strings;

import java.util.Scanner;

public class B2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder P = new StringBuilder();
		
		while(T>0) {
			T--;
			int R = sc.nextInt();
			String test = sc.next();			
			for(int i=0; i<test.length();i++) {
				int temp = R;
				while(temp>0) {
					temp--;
					P.append(test.charAt(i));
				}
			}
			P.append("\n");
		}
		System.out.println(P);
	}
}
