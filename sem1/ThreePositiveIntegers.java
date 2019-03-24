//Galaura, Alexis Lyndon
//Midterm Exam
import java.util.Scanner;
public class ThreePositiveIntegers{
	public static void main(String[] args){
		System.out.println("This program will ask 3 positive numbers from user.");
		System.out.println("This program will display all the numbers divisible by the third number");
		System.out.println("The range to be evaluated will be from the 1st number supplied to the 2nd");
		System.out.println();
		
		int divisor,num2,num1;
		
		boolean valid;
		do{
			System.out.println("Enter the two numbers starting with the smaller one");
			
			Scanner sc1 = new Scanner(System.in); 
			num1 = sc1.nextInt();
			Scanner sc2 = new Scanner(System.in);
			num2 = sc2.nextInt();
			System.out.println("Enter the third number:");
			Scanner sc3 = new Scanner(System.in);
			divisor = sc3.nextInt();
			valid = num1<num2;
			valid = num1>0;
			valid = num2>0;
			valid = divisor>0;
			if( !valid){
			System.out.println("Invalid Input!");
			}
		}while(!valid); //invalid input detection ends here
		
		//the real code starts here
		System.out.println("Numbers divisible by " + divisor + " between " + num1 +  " and " + num2 +  " are: ");
		for(int b=num1; b<num2; b++){    
			
			if(b % divisor == 0){
				System.out.println(b);
			}
		}
		
		
		
		
		
	}
}