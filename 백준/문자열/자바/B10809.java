package Strings;

import java.util.Scanner;

public class B10809 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		for(char a ='a'; a<='z'; a++) {
			System.out.print(input.indexOf(a)+" ");
			
		}
		
	}	
}
