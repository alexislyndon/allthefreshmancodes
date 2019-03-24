//Alexis Lyndon Guian Galaura
//CC11 Lab - CCD
//July 20, 2018
//MultiplicationTable args
//This program takes in a number and outputs a its multiplication table ranging from x1 to x10
public class MultiplicationTable{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int Counter = 0;
		
		while(Counter !=10){
			Counter = Counter +1;
			int Product = n * Counter;
			System.out.println(+n+ "x" + Counter+ "=" + Product);
		}
	}
}