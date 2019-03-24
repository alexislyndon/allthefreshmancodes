
public class Node {
	public char info;
	public Node next;
	public Node(char i) { //tail
	this(i,null);
	}
	public Node(char i, Node n) {
	info = i; next = n;
	}
}