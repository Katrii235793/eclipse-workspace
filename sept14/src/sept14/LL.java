package sept14;
public class LL {

	private Node head;
	private Node tail;
	private int size;
	private int data;
	private Object next;
		// TODO Auto-generated method stub
		public LL() {
			this.size=0;
		}
private class Node{
	private int data;
	private Node next;//points to next box
}
public void Node(int data) {//constructor
	this.data = data;
	
	}
public void Node(int data,Node next) {//constructor
	this.data = data;
	this.next = null;
}
}