/*
*Galaura, Alexis Lyndon
*BSIT - 1
*
*/
import java.util.Scanner;

public class FindTwoLargest{
	
	public static void main ( String args[]){
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program finds the two largest in a list,");
		System.out.println("Enter values, one per line, using a o to signal the end of the line,");
		
		int num = scan.nextInt();
		int largest = num, secondlargest = 0;
		num = scan.nextInt();
		if(num>largest){
			secondlargest = largest;
			largest=num;
		}
		else if(num>secondlargest){
			secondlargest = num;
		}
		
		while(num !=0){
			num = scan.nextInt();
			
			if(num>largest){
				secondlargest = largest;
				largest = num;
			}
			else if(num>secondlargest){
				secondlargest = num;
			}	
		}
		
		System.out.println("The largest is" + largest + "secondlargest is" + secondlargest);
	}
}	
		