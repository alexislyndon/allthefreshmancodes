//Galaura, Alexis Lyndon
//BSIT - 1 sem1
//this program will print the larger of the two numbers provided
import java.util.Scanner; 
public class LargestNum {
	public static void main(String[] args) {
		Scanner scanr = new Scanner(System.in);
		
		int value1, value2,MAX;
		System.out.println("Enter First number ");
		value1 = scanr.nextInt();
		System.out.println("Enter Second number");
		value2 = scanr.nextInt();
		
		if(value1>value2){
			MAX = value1;
		}
		else{
			MAX = value2;
		}
		System.out.print("\n"+"\n"+"The largest value is " +"\n"+">"+ MAX);
	}
}