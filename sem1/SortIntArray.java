//Galaura, Alexis Lyndon
//CC11 Lab - CCD
//August 31, 2018
//SortIntArray 
public class SortIntArray{
public static void main(String[] args){
	int n=7;		
	int[] a = new int[n]; 
	int temp;
	
	a[0] = 2;
    a[1] = 1;
    a[2] = 3;
    a[3] = 4;
    a[4] = 5;
    a[5] = 6;
    a[6] = 7;
	
	
		System.out.print("in Order:"); 
		for (int i = 0; i < n; i++){ //prints in order

            System.out.print(a[i] + ",");
		}
		
		System.out.println();
		System.out.print("reverse Order:");
		for (int i = 6; i >= 0; i--){ //prints in reverse order
			System.out.print(a[i] + ",");
		}
			
		for (int i = 0; i <= n; i++){ //this will arrange things
			for (int j = i + 1; j < n; j++){

                if (a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
                }
			}

        }
		
		System.out.println();
        System.out.print("Ascending Order:");
		for (int i = 0; i < n; i++){
			System.out.print(a[i] + ",");
		}
		
		System.out.println(); 
		System.out.print("Descending Order:");
		for (int i = 6; i >= 0 ; i--){
			System.out.print(a[i] + ",");
		}
        
	}

}
	