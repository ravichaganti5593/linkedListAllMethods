package linkedList;

public class doubleNode {
	static int numberOfNodes = 0;
	int data;
	doubleNode previousNode;
	doubleNode nextNode;
	
	doubleNode(int data) {
		this.data = data;
		numberOfNodes++;
	}
}
