/*
Galaura, Alexis Lyndon G. || BSIT 1
cc 12 - ccb
date started: nov 28, 2018
date finished: dec 10, 2018
program: Inserter Deleter array with search
*/
import java.util.*;
public class cc12InsDel {
	public static void main(String [] args) {
			System.out.println("Enter size of array: ");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int array[] = new int[size];
			System.out.println();
			Display(array);
			
			
			int mode = 69;
			int lastindex = size-1;
			int counter = 0;
			
			
			do {
				
				System.out.println("\n"+"Enter mode: ");
				System.out.println("1 -- Insert");
				System.out.println("2 -- Delete");
				System.out.println("3 -- Search");
				System.out.println("0 -- Exit");
				mode = sc.nextInt();
				
				if(mode==1 && counter<size){ //Inserter; (counter<size) prevents adding more than array can hold
					System.out.println("Enter number to insert: ");
					int ins = sc.nextInt();
					if(counter==0){
						array[0] = ins;
						counter++;
					}
					
					else{
						boolean found = false;
						
						for(int i = 0; i<counter; i++){
							
							if(ins>=array[counter-1]){
								array[counter] = ins;
							}
							else if(ins<array[i] && found==false){
								int mark = i;
								for(int j=counter; j>mark; j--){
									array[j] = array[j-1];
								}
								array[mark] = ins;
								found = true;
							}
						}
						counter++;
					}
					Display(array);
				}
				
				else if(mode==2 && counter>0){ //Deleter
					System.out.println("Enter number to delete: ");
					int del = sc.nextInt();
					for(int i = 0; i<size; i++){
						if(del == array[i]){
							while(i<counter-1){
								array[i] = array[i+1];
								i++;
							}
						}
					}array[counter-1] = 0;
					counter--;
					Display(array);
					
				}
				
				else if(mode==3){//search
					System.out.println("Enter number to search: ");
					int find = sc.nextInt();
					boolean found = false;
					int x = 0;
					while(!found && x < counter){
						if(find==array[x]){
							System.out.printf("   %d is in the array. \n\n", find);
							found = true;
							break;
						}
						x++;
						if (x==counter) System.out.printf("   %d is not in the array. \n\n", find); 
					}
					
					Display(array);
				}
				
				else if(mode==0){ //exit
				break;
				}
				
				
				else{ 
				System.out.println("Invalid input.");
				}
			}while(true); 
	}
	
	public static void Display(int array[]){ //displayer slave
		System.out.print("-----");
		for(int i = 0; i<array.length; i++)
		System.out.print(array[i]);
		
		System.out.println("-----");
	}
}