package DP;

import java.util.Scanner;

public class DP08_B1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] table = new int[N+1];
		for(int i=1; i<N+1;i++) {
			int[] count = {0,0,0};
			if (i<=3)
				table[i] = 1;
			else {
				if(i%3==0)
					count[0] = table[i/3]+1;
				else if(i%2 ==0)
					count[1] = table[i/2]+1;
				else
					count[2] = table[i-1]+1;
			
				int cnt=0;
				int min = count[0];
				while(cnt<3) {
					if(min>count[cnt])
						min = count[cnt];
					cnt++;
				}
				if (min!=0)
					table[i] = min;
			}
		}
		System.out.println(table[N]);
		sc.close();
	}

}
