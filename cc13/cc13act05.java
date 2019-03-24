/*
 * GALAURA, Alexis Lyndon || BSIT -1
 * cc 13 - ccb
 * Program: Greatest Common Divisor | Recursion | Java
 * Date Started: 15dec2018 Date Finished: 15dec2018
*/

import java.util.*;
public class cc13act05 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int samplesize = sc.nextInt();
		int p[] = new int[samplesize];
		
		for(int i = 0; i<samplesize; i++)  
			p[i] = GCDiv(sc.nextInt(),sc.nextInt());
		
		for(int i = 1; i<=samplesize; i++) 
			System.out.println("Case #" + i + ": " + p[i-1]);
	}
	
	public static int GCDiv(int x, int y) {
		if(y==0) return x;
		else return GCDiv(y, x%y);
	}
}