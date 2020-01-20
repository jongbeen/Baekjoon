package DP;

import java.util.Scanner;

public class DP01_B2748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//double도 안되고, int는 90찍으면 마스킹비트 때문에 음수...long만 됨
		long[] table = new long[n+1];
		
		for(int i=0;i<n+1;i++) {
			if(i==0)
				table[i] = 0;
			else if(i<=2)
				table[i] = 1;
			else
				table[i] = table[i-1] + table[i-2];	
		}
		System.out.println(table[n]);
		sc.close();
	}
}
