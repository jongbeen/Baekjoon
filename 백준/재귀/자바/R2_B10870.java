package Recursive;

import java.util.Scanner;

public class R2_B10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int num = fibo(N);
		System.out.println(num);	
	}	
	static int fibo(int N) {
		if(N<=1)
			return N;
		else
			return fibo(N-1)+fibo(N-2);			
	}
}
