/**
@author Galaura, Alexis Lyndon | BSIT - 1
CC13 - B
Activity 12
*/

/**
 *CC12 Act12 - Search insert delete elements from array
 *
 */
public class Activity12{ //
	
	
	
	public static void main(String[] args){
		
		int[] initial = {2,4,6,8,9,10,20,33,44,45,68,88};
		int[] array = new int[100];
		int arraysize = 12;

		//fills array with initial values
		for(int i=0;i<initial.length;i++){
			array[i] = initial[i];
		}
		
		//inserts elements to array
		int[] insert = {3,78,98,12};
		for(int i = 0; i < insert.length;i++){
			arraysize++;
			insertElement(array,insert[i],arraysize);
		}
		
		//deletes elements from array, if found
		int[] delete = {20,44,89};
		for(int i = 0; i < delete.length; i++){
			deleteElement(array,delete[i],arraysize);
			arraysize--;
		}
		
		//searches elements
		int[] search = {8,45,88,90};
		for(int i = 0; i < search.length; i++){
			searchElement(array,search[i],arraysize);
		}
		
		displayAll(array,arraysize);
		
	}
	
	public static void displayAll(int[] array,int arraysize){
		
		System.out.print("Elements of the list:");
		
		for(int i=0;i<arraysize;i++){
			
			System.out.print(" " + array[i]);
			
		}
	}
	
	//binary search algorithm used in all the other methods
	public static int binarySearch(int[] array,int element,int arraysize){
		
		int first = 0, mid = 0, last = arraysize-1;
		boolean found = false;
		
		while(first <= last && !found){
			
			mid = (first + last)/2;
			if(array[mid] == element){
				found = true;
			} else{
				if(element > array[mid]){
					first = mid + 1;
				} else{
					last = mid - 1;
				}
			}
		}

		return mid;	
		
	}
	
	public static void searchElement(int[] array,int element,int arraysize){
		
		int index = binarySearch(array,element,arraysize);
		
		if(array[index] == element){
			System.out.println(element + " is found at location " + index + ".");
		} else {
			System.out.println(element + " is not found.");
		}
		
	}
	
	//uses binarySearch method to find nearest index and inserts from its left, it then shifts the rest of the array to the right
	public static void insertElement(int[] array,int element,int arraysize){
	
		int index = binarySearch(array,element,arraysize);
		
		//makes sure to add from left of index
		if(element>array[index] && array[index] != 0){
			index++;
		}
		
		int temp = array[index];
		array[index] = element;
			
		//shifts elements to the right
		for(int i = index+1; i < arraysize; i++){
			
			int temp2 = array[i];
			array[i] = temp;
			temp = temp2;
			
		}
		
		System.out.println(element + " is inserted in the list.");
	}
	
	//uses binarySearch method to find the element, deletes it, and shifts elements on the right to the left
	public static void deleteElement(int[] array, int element, int arraysize){
		
		int index = binarySearch(array,element,arraysize);
		
		if(element == array[index]){
			
			for(int i = index; i < arraysize; i++){
				array[i] = array[i+1];
			}
			
			System.out.println(element + " is removed from the list.");
		} 
		else {
			System.out.println(element + " is not found.");
		}
		
	}
}