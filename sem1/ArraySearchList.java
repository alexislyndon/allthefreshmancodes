//Galaura, Alexis Lyndon
//CC11 Lab - CCD
//August 31, 2018
//ArraySearchList 
import java.util.Scanner;
public class ArraySearchList{
public static void main(String[] args){ 
Scanner sc = new Scanner(System.in);
		String A[] = {"James", "John", "Peter", "Andrew", "Philip", "Nathael", "Matthew", "Thomas", "James son of Alphaeus", "Simon the Zealot", "Judas", "Judas Iscariot"};
		
		System.out.print("Enter Name of Apostle: ");
	
		String a = sc.nextLine();
		
		
		boolean found = true;
			for(int i = 0; i<A.length; i++){
				if(found = A[i].equalsIgnoreCase(a)){
					found = true;
					break;
				}
			}
			if (found){
				System.out.println("A Disciple of Jesus");
			}
			else{
				System.out.println("Not a Disciple of Jesus");
			}		
		}
	}
