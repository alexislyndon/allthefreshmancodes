//Galaura, Alexis Lyndon
//BSIT - 1 sem1
//This java program will average 4 scores and will print PASS if the average is 50 and above, FAIL if below 50.
import java.util.Scanner;
public class PassFail { 
	public static void main(String[] args) 
	{
		Scanner scanr = new Scanner( System.in ); 
		
		int m1,m2,m3,m4,avg;
		
		System.out.println("This java program will average 4 scores and will print PASS if the average is 50 and above, FAIL if below 50.");
		System.out.println(""); //line break
		
		System.out.println("Enter score#1");
		m1 = scanr.nextInt();
		
		System.out.println("Enter score#2");
		m2 = scanr.nextInt( );
		
		System.out.println("Enter score#3");
		m3 = scanr.nextInt( );
		
		System.out.println("Enter score#4");
		m4 = scanr.nextInt( );
		
		avg = ((m1+m2+m3+m4)/4);
		
		if (avg<50){
	
		System.out.println("\n"+"\n"+"FAIL");
		}
		else{
			System.out.println("\n"+"\n"+"PASS");
		}
    }
	
}