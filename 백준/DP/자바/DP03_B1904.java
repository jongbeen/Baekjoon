package DP;

import java.util.Scanner;

public class DP03_B1904 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] table = new int[N+1];
		
		for(int i=0; i<N+1;i++) {
			if(i<=3)
				table[i] = i;
			else
				table[i] = (table[i-1] + table[i-2]) % 15746;
		}	
		System.out.println(table[N]);
	}
}
