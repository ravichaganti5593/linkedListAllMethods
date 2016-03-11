package linkedList;

public class Node3 {
	static int numberOfNodes = 0;
	
	int data;
	Node3 nextNode;
	
	
	Node3(int data) {
		this.data = data;
		numberOfNodes++;
	}
	
}
