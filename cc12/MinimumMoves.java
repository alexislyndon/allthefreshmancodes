/*
GALAURA, Alexis Lyndon
Nov 16, 2018
cc 12 - ccb
Activity 0
*/


import java.util.*;
public class MinimumMoves {
	public static void main (String[] args) {
		Intro();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = N;
		int moves = 0;
		String operations[] = new String[N];
		
		do {
			
			if(N % 2 == 0) {
				N /= 2;
				operations[moves] = "x 2 ";
			}
			
			else {
				N -= 1;
				operations[moves] = "+ 1 ";
			}
			moves++;
			
		}while(N>1);
		
		System.out.print("1 ");
		for(int i=moves-1; i>=0; i--) {
			System.out.print(operations[i]);
			}
		System.out.printf("= %d", m);
		System.out.printf("\n The number of moves:%d ", moves);
	}
	
	public static void Intro() {
		System.out.println("This program will find the least amount of steps needed to arrive");
		System.out.println("at a user supplied number by only using +1 & x2 as operators.");
		System.out.println("Base number -- 1");
		System.out.println("Enter Number:");
	}
}


