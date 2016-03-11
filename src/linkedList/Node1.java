package linkedList;

public class Node1 {
	static int noOfNodes = 0;
	
	int data;
	Node1 nextNode;
	
	Node1(int data) {
		this.data = data;
		noOfNodes++;
	}
}
