/*
GALAURA, Alexis Lyndon G.
CC 12 - CCB
NOV 16, 2018
Program: narcissistic numbers
*/
import java.util.*;
public class Activity1 {
	public static void main (String[] args) {
		int m,length,a,c = 0,sum = 0;
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		m = N;
		length = Integer.toString(N).length(); //converts input to string, counts the length, then convert back to int
		double array1[][] = new double[2][length];
		
		//integer --> individual digits
		while(m>0) {
			a = m % 10;
			m = m / 10;
			array1[0][c] = a;
			c++;
		}
		
		//raises individual digit to exponent then adds them
		for(int j = 0; j<length; j++) {
			array1[1][j] = Math.pow(array1[0][j],length);
			sum += array1[1][j]; 
		}
		
		if(N==sum){
			System.out.println("YES! Narcissistic!");
			}
		else {
			System.out.println("NO! Not Narcissistic.");
		}
	}
}

		
		