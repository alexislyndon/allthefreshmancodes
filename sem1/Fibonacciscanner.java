//Alexis Lyndon Guian Galaura
//CC11 Lab - CCD
//July 20, 2018
//Fibonacci scanner
//This program takes an input number n and displays n numbers of Fibonacci numbers using Scanner class
import java.util.Scanner;
public class FibonacciScanner{
	public static void main(String[] args){
        int a = 0, b = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.print("First " + n + " terms: ");
	
        for (int i = 1; i <= n; i++){
            System.out.print(a + ", ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}