/*
GALAURA, Alexis Lyndon || BSIT -1
cc 12 - ccb
Program: Insert Sort Array || Java

*/
import java.util.*;
public class SortInsert {
	//Sorter method
	static void Sort(int array[]) {		
		for(int i=1; i<array.length; i++){ //starts at index 1 - program will compare prev index
			int key = array[i]; //saves num to be inserted later
			int prev = i-1; //prev will be used in the while loop
			while(prev>=0 && array[prev] > key) { //prev>= prevents negative index || loop as long as prev larger than key
				array[prev+1] = array[prev]; //inserts prev to the right
				prev--; //next index lower
			}
			array[prev+1] = key; //prev+1 bcs while-loop makes prev-- at the end
		}
	}
	
	//display slave
	public static void Display(int array[]) {
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i = 0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
		
		SortInsert si = new SortInsert();
		si.Sort(array);
		
		Display(array);
		
	}
}