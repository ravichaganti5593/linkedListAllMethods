package linkedList;

public class Node {
	static int noOfNodes = 0;		//count the number of nodes
	
	int data;					//store the data
	Node nextNode;				//a pointer to the next node
	
	Node(int data) {
		this.data = data;		//taking in the value data and storing it as data
		noOfNodes++;
	}
}

	
