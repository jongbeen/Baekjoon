package DP;

import java.util.Scanner;

public class DP04_B9461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] ans = new long[T];
		int j=0;
		long[] table;
		
		while(T-->0) {
			int N = sc.nextInt();
			table = new long[N+1];
			for (int i=1; i<N+1;i++) {
				if(i<=3)
					table[i] = 1;
				else if(i<=5)
					table[i] = 2;
				else {
					table[i] = table[i-1] + table[i-5];
				}
			}
			ans[j++] = table[N];
		}
		for(int i=0; i<ans.length;i++)
			System.out.println(ans[i]);
	}
}
