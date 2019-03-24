/*
Galaura, Alexis Lyndon  || BSIT - 1
CC 13 - CCB
BSIT - 1
Program: Matrix Multiplication 
*/

import java.util.*;
public class MatrixProduct {
	public static void main (String[] args) {
		int ra, ca, rb, cb;
		
		do {
			Scanner sc = new Scanner(System.in);
			
			//matrix A size
			ra = sc.nextInt();
			ca= sc.nextInt();
			int matrixA[][] = new int[ra][ca];
		
			//fill A
			for(int i=0; i<ra; i++) {
				for(int j=0; j<ca; j++) {
					matrixA[i][j] = sc.nextInt();
				}
			}
			
			//matrix B size
			rb = sc.nextInt();
			cb= sc.nextInt();
			int matrixB[][] = new int[rb][cb];
				
			if(ca!=rb) {
				System.out.println("Product undefined. Restart Program");
				continue;
			}
			
			else {
			//fill B
				for(int i=0; i<rb; i++) {
					for(int j=0; j<cb; j++) {
						matrixB[i][j] = sc.nextInt();
					}
				}
				Multiplier(ra, cb, ca, matrixA, matrixB);
			}
		}while(ca!=rb);
	}	
	
	//performs matrix multiplication, and prints
	public static void Multiplier(int ra, int cb, int ca, int matrixA[][], int matrixB[][]) {	
		int prod[][] = new int[ra][cb];
		System.out.println("\n" + "Product:" + "\n");
		for(int i=0; i<ra; i++) {
			for(int j=0; j<cb; j++) {
				int sum=0;
				for(int k=0; k<ca; k++) {
				sum += matrixA[i][k] * matrixB[k][j];
				}
				prod[i][j] = sum;
				System.out.printf("%7d", prod[i][j]);
			}System.out.println();
		}
	}
}