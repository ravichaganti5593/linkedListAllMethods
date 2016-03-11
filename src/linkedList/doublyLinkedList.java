package linkedList;

public class doublyLinkedList {
	
	static doubleNode current;
	static doubleNode temp;
	static doubleNode head;
	
	public void addNode(int data) {
		doubleNode node = new doubleNode(data);
		
		if (head == null) {
			head = node;
			head.previousNode = null;
			head.nextNode = null;
		}
		
		else {
			current = head;
			while (current.nextNode != null) {
				current = current.nextNode;
			}
			current.nextNode = node;
			node.nextNode = null;
			node.previousNode = current;
		}
	}
	
	public void deleteNode(int position) {
		current = head;
		doubleNode temp1;
		if (position == 1) {
			head = current.nextNode;
			current = head;
			current.previousNode = null;
		}
		else {
			int temp = 1;
			while(temp != position-1) {
				current = current.nextNode;
				temp++;
			}
			current.nextNode = current.nextNode.nextNode;
			temp1 = current;
			current = current.nextNode;
			current.previousNode = temp1;
		}
		doubleNode.numberOfNodes--;
	}
	
	public void print() {
		current = head;
		
		while(current != null) {
			System.out.println(current.data);
			current = current.nextNode;
		}
		
	}
	
	public void reverseDoublyLinkedList() {
		
	}
	public static void main(String[] args) {
		doublyLinkedList list = new doublyLinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.deleteNode(1);
		list.print();
	}
}
