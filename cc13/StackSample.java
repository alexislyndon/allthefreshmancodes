/*
Galaura, Alexis Lyndon  || BSIT - 1
CC 13 - CCB
Program: Matching Parentheses
December 10, 2018
*/
import java.util.Scanner;
public class StackSample {
	public static void main(String[] args){
		Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		boolean match [] = new boolean [size];
		
		
		for(int i = 0; i < size; i++){
			boolean check = false;
			String st = sc.next();
			char ch[] = st.toCharArray();
			
			
			
			for(int j = 0; j<ch.length; j++){
				
				if(ch[j] == '('){
					stack.push(ch[j]);
				}
				else {
					if(!stack.isEmpty())
						stack.pop();
					else {check = true;
						break;
					}
					
				}
				
			}
			
			if(stack.isEmpty() && check==false)  match[i] = true;
			else  match[i] = false;
			stack.clear();
		}
		for(int x = 0; x<match.length; x++) {
			int n = x+1;
			if(match[x]) System.out.println("Case #" + n + ":" + "properly matched");
			else System.out.println("Case #" + n + ":" + "NOT properly matched"); 
		}
	}
}