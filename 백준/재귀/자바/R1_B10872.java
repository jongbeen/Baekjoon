package Recursive;

import java.util.Scanner;

public class R1_B10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int N=0;

		N=sc.nextInt();
		if(N>=0 && N<=12){
		    int num=0;
		    num = factorial(N);
		    System.out.println(num);	
        }	
//		do {
//		N = sc.nextInt();
//		if(N>12 || N<0)
//			check=true;
//		else
//			check=false;
//		}while(check);
//		
//		int num=0;
//		num = factorial(N);
//		System.out.println(num);	
	}
	static int factorial(int N) {
		if(N<=1)
			return N;
		else
			return N*factorial(N-1);
	}
}
  