/* Galaura, Alexis Lyndon G. || BSIT -1
** CC13 - CCB
** Singly linked list | Java
** Dec 3, 2018
** 
** 
*/ 
import java.util.Scanner;

public class cc13Act03 {
	public static void main(String[] args){
	
	LinkedList List = new LinkedList();
	
	Scanner scan = new Scanner(System.in);
	int choice = 1;
	
	while(choice != 0){
		
		menu();
		System.out.print("Choice: ");
		choice = scan.nextInt();
		boolean check = true;

		switch(choice){
			case 1:	System.out.print("Input number to add to head: ");
					List.addToHead(scan.nextInt());
					pressEnter();
					break;
					
			case 2: System.out.print("Input number to add to tail: ");
					if(List.isEmpty() == true)
						List.addToHead(scan.nextInt());
					else
						List.addToTail(scan.nextInt());
					pressEnter();
					break;
					
			case 3: List.deleteFromHead();
					pressEnter();
					break;
					
			case 4: List.deleteFromTail();
					pressEnter();
					break;
					
			case 5: System.out.print("Input number to find in list: ");
					List.isInList(scan.nextInt());
					pressEnter();
					break;
					
			case 6: System.out.print("Input number to delete from the list: ");
					List.delete(scan.nextInt());
					pressEnter();
					break;
					
			case 7: if(List.isEmpty() == true)
						System.out.println("List is empty.");
					else
						List.printer();
					pressEnter();
					break;
			
			}		
		}	
	}
	
	public static void menu(){

		System.out.println("\n0 - Exit");
		System.out.println("1 - Add to Head");
		System.out.println("2 - Add to Tail");
		System.out.println("3 - Delete from Head");
		System.out.println("4 - Delete from Tail");
		System.out.println("5 - Is in List");
		System.out.println("6 - Delete a Value");
		System.out.println("7 - Print all\n\n");				
	}
	
	private static void pressEnter() { 
        System.out.println("\nPress Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
	}
}

class Node {

	public int info;
	public Node next;
	
	Node() {
		info = 0;
		next = null;
	}
}

class LinkedList {
	
	public Node headNode;

	LinkedList() {
		
		headNode = null;

	}
	
	public boolean isEmpty(){
		return (headNode == null);
	}
	
	
	public void addToHead(int i){
		
		Node newNode = new Node();
		newNode.info = i;
		newNode.next = headNode;
		headNode = newNode;
		
		System.out.println(i+ " succesfully added to head.");
		
	}
	

	public void addToTail(int i){
		
		Node newNode = new Node();
		newNode.info = i;
		
		Node currentNode = new Node();
		currentNode = headNode;
		
		while(currentNode.next != null){
			currentNode = currentNode.next;
		}
		
		currentNode.next = newNode;
	
		System.out.print(i+ " succesfully added to tail.");
		
	}
	
	
	public void deleteFromHead(){
		
		if(headNode == null){
			System.out.print("List is Empty");
		}
		else {
			headNode = headNode.next;
			System.out.println("Succesfully deleted from head.");
		}				
	}
	
	public void deleteFromTail(){
			
		//empty list
		if(headNode == null){
			
			System.out.print("List is Empty");
			return;
			
		}
		//1 element
		else if(headNode.next == null){
			
			headNode = null;
			
		}else {
			Node currentNode = new Node();
			Node previousNode = new Node();
			currentNode = headNode;
			while(currentNode.next != null){
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			previousNode.next = null;
		
		}
		
		System.out.println("Succesfully deleted from tail.");
	}
		
	
	public void isInList(int i){		
		
		Node node = new Node();
		node = headNode;
		
		while(node != null){
			if (node.info == i){
				
				System.out.print("Number is IN the list");
				break;
			}
			else
				node = node.next;
		}
		
		if (node == null)
			System.out.print("Number is NOT in the list");
	}	
	
	
	public void delete(int i){
		Node currentNode = new Node();
		Node previousNode = new Node();
				
		currentNode = headNode;
		
		//empty list
		if(headNode == null){
			System.out.print("List is empty.");
			return;
		}
		
		
		//if number is head
		if(headNode.info == i) {
			headNode = headNode.next;
			System.out.print("Number succesfully deleted from the list.");
			return;
		}
		
		//iterates through the list and check if num is in it
		while(currentNode.next != null){
			previousNode = currentNode;
			currentNode = currentNode.next;
			
			//if number is found, previousNode is linked to currentNode.next
			if(currentNode.info == i){
				previousNode.next = currentNode.next;
				System.out.print("Number succesfully deleted from the list.");
				return;
			}
		
		}
		
		System.out.print("Number is not in the list.");
				
	}
	
	public void printer(){
		
		Node node = headNode;
		
		while(node != null){
			System.out.print("  " + node.info +"  ");
			node = node.next;
		}
	}
}