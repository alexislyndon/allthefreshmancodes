/*
Francis R. Cuenca
BSCS 1
CC13 - CCB

Activity 02 - Multidimensional Arrays
*/


import java.util.Scanner;

public class Activity02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//used for while loop
		boolean valid = false;
		
		//length of corresponding dimensions for corresponding matrices
		int rows1 = 0;
		int columns1 = 0;
		int rows2 = 0;
		int columns2 = 0;
		
		//loop to make sure we can perform dotproduct
		while (valid == false)
		{
		
			//Matrix 1
			System.out.printf("\nInput number of rows for Matrix 1: ");
			rows1 = scan.nextInt();
			System.out.print("Input number of columns for Matrix 1: ");
			columns1 = scan.nextInt();
		
			//Matrix 2		
			System.out.print("Input number of rows for Matrix 2: ");
			rows2 = scan.nextInt();
			System.out.print("Input number of columns for Matrix 2: ");
			columns2 = scan.nextInt();
			
			
			//Check if dot product is possible
			if (columns1 == rows2 )
			{
				valid = true;
			}
			else
				System.out.print("Please make sure the number of columns from Matrix 1 is equal to the number of rows from Matrix 2.");
		}
		
		//Initializing matrices
		int Matrix1 [][] = new int[rows1][columns1];
		int Matrix2 [][] = new int[rows2][columns2];
		
		//space
		System.out.printf("\n\n");
		
		//Fill Matrix 1		
		int i = 0; //stores column number
		int x = 0; //stores   row  number
				
		for(x = 0; x <= (rows1-1); x++)
		{
			for(i = 0; i <= (columns1-1); i++)
			{
				System.out.printf("Please input element %d of row %d for Matrix 1:   ", i + 1, x + 1);
				Matrix1[x][i] = scan.nextInt(); 
			}
		} 
		
		//space
		System.out.printf("\n\n");
		
		//Fill Matrix 2					
		for(x = 0; x <= (rows2-1); x++)
		{
			for(i = 0; i <= (columns2-1); i++)
			{
				System.out.printf("Please input element %d of row %d for Matrix 2:   ", i + 1, x + 1);
				Matrix2[x][i] = scan.nextInt();
			}
		} 
		
		//Display Matrices for testing
		
		System.out.printf("\n\n   Matrix 1:\n\n");
		
		for(x = 0; x <= (rows1-1); x++)
		{
			for(i = 0; i <= (columns1-1); i++)
			{
				System.out.printf("%d	",Matrix1[x][i]);	
			}
			
			System.out.printf("\n\n");
			
		}
		
		
		System.out.printf("\n\n   Matrix 2:\n\n");
		
		for(x = 0; x <= (rows2-1); x++)
		{
			for(i = 0; i <= (columns2-1); i++)
			{
				System.out.printf("%d	",Matrix2[x][i]);	
			}
			
			System.out.printf("\n\n");
			
		} 
		
	
		//Initialize product matrix
		int MatrixOutput[][] = new int [rows1][columns2];
		//Initialize arrays to use for dotproduct method
		int elementsrow[] = new int [columns1];
		int elementscolumn[] = new int [rows2];
		
		//Filling MatrixOutput
		for(x = 0; x < (rows1); x++) //x rows, i columns
		{
			for(i = 0; i < (columns2);i++)
			{	
		
				//Fill elementsrow
				for(int ctr = 0; ctr < (columns1); ctr++)
				{
					elementsrow[ctr] = getelementM1(x,ctr,Matrix1);
				}
				
				//Fill elementscolumn
				for(int ctr = 0; ctr < (rows2); ctr++)
				{
					elementscolumn[ctr] = getelementM2(i,ctr,Matrix2);
				}
				 
				MatrixOutput[x][i] = dotproduct(elementsrow,elementscolumn,columns1);
			}
		}
	
		//Print MatrixOutput
		System.out.printf("\n\n   Product Matrix:\n\n");
		
		for(x = 0; x <= (rows1-1); x++)
		{
			for(i = 0; i <= (columns2-1); i++)
			{
				System.out.printf("%d	",MatrixOutput[x][i]);	
			}			
			System.out.printf("\n\n");		
		}
		
	}
	
	
	//get element [ctr] of specific row from M1
	public static int getelementM1(int rownum,int elementnum,int[][] parent)
	{
		
		int element = parent[rownum][elementnum];
		return element;
		
	}
	
	//get element [ctr] of specific column from M2
	public static int getelementM2(int columnnum,int elementnum,int[][] parent)
	{
		
		int element = parent[elementnum][columnnum];
		return element;
		
	}
	
	//dotproduct method solves for element OutputMatrix[x][i] using the algorithm in the problem
	public static int dotproduct(int[] row, int[] column, int step)
		{
			int sum = 0;
	
			for(int i = 0; i<(step);i++)
			{
				sum = sum + (row[i]*column[i]);
			}
	
			return sum;
		}
}