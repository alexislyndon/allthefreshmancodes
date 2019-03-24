
public class Stack {
	protected Node head;
	public Stack() {
	head = null;
	}
	public boolean isEmpty() {
	return head == null;
	}
	
	public void push(char el) {
	head = new Node(el,head);
	}
	
	public void pop() {
		if(head.next==null) head = null;
		
		else head = head.next;
	}
	
	public void clear() {
		head = null;
		
	}
	
}