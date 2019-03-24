//Alexis Lyndon Guian Galaura
//CC11 Lab - CCD
//July 20, 2018
//MultiplicationTable Scanner
//This program takes in a number and outputs a its multiplication table ranging from x1 to x10
import java.util.Scanner;
public class MultiplicationTableScanner{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Counter = 0;
		
		while(Counter !=10){
			Counter = Counter +1;
			int Product = n * Counter;
			System.out.println(+n+ "x" + Counter+ "=" + Product);
		}
	}
}