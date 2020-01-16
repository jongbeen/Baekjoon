package Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class S6_B1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input," ");
		
//		while(st.hasMoreTokens()) {
//			String token = st.nextToken();
//			System.out.println(token);
//		}	
		System.out.println(st.countTokens());		
	}
}
