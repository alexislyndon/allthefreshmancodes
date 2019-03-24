//Galaura, Alexis Lyndon
//CC11 Lab - CCD
//August 3, 2018
import java.util.Scanner;
public class GradingSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double grade = sc.nextDouble();
		if(grade >= 92){
			System.out.println("Excellent!");
			System.out.println("Letter Grade: A");
		}
		else if ( ( grade <92) && (grade >= 84) ){
			System.out.println("Very Good!");
			System.out.println("Letter Grade: A-");
		}
		else if ( ( grade <84) && (grade >= 76) ){
			System.out.println("Good");
			System.out.println("Letter Grade: B");
		}
		else if ( ( grade <76) && (grade >= 68) ){
			System.out.println("Fair");
			System.out.println("Letter Grade: B-");
		}
		else if ( ( grade <68) && (grade >= 60) ){
			System.out.println("Satisfactory");
			System.out.println("Letter Grade: C");
		}
		else if ( ( grade <60) && (grade >= 50) ){
			System.out.println("PASSED");
			System.out.println("Letter Grade: D");
		}
		else{
			System.out.println("FAILED");
			System.out.println("Letter Grade: F");
		}
	}
}
	
	