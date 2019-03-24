//Alexis Lyndon Guian Galaura
//CC11 Lab - CCD
//July 20, 2018
//Fibonacci args
//This program takes an input number n and displays n numbers of Fibonacci numbers using args
public class Fibonacci{
	public static void main(String[] args){
		int a = 0, b = 1;
		int n = Integer.parseInt(args[0]);
		System.out.print("First " + n + " terms: ");
		
		for (int i = 1; i <= n; i++){
            System.out.print(a + ", ");
            int x = a + b;
            a = b;
            b = x;
        }
	}
}