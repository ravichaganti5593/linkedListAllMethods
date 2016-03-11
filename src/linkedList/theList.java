package linkedList;

public class theList {
	
	static Node current;	//current node for traversing
	static Node temp;		//for transferring data and stuff
	static Node head; 		//constant, point to the root of the linkedList
	
	
	//to add a node to the end of the linkedList
	public void addNode (int data) {
		Node node = new Node (data);
		
		if (head == null) {			//to check for an empty linkedList
			head = node; 			//storing the value node into root
			node.nextNode = null; 	//storing null value to the next node
		}
		
		else {
			current = head;			//storing the root value into current
			
			//traversing through the linkedList (checking for the nextNode value to be null) to add node
			while (current.nextNode != null) {
				current = current.nextNode;
			}
			current = node;			//finally storing the value of node
			node.nextNode = null;	//defining the added node's pointer as null
		}
		
	}
	
	//to insert a node anywhere in the linkedList
	public void insertNode(int data, int position) {
		Node node = new Node (data);
		int tempPosition = 1;				//to define the 1st node position
		current = head;						//set current node as head node
		
		//to insert node before head node, define position as 0
		if (position == 0) {
			current = node;
			current.nextNode = head;
		}
		
		while (tempPosition!= position) {	//traversing again
			current = current.nextNode;		//setting the current to the next node
			tempPosition++;					//incrementing your position
		}
		//if position is equal
		temp = current.nextNode;			//temporarily store the nextNode value
		current.nextNode = node;			//replace current node's nextNode value with new node
		node.nextNode = temp;				//define new node's nextNode value as temp
	}
	
	//to delete a node at a particular position in the linkedList
	public void deleteNode(int position) {
		current = head;
		int tempPosition = 1;
		
		//to delete the 1st element
		if (tempPosition == position) {	
			current = current.nextNode;
		}
		//deleting the last element
		else {
			while (tempPosition != position -1) {
				current = current.nextNode;
				tempPosition++;
			}
			current.nextNode = current.nextNode.nextNode;
		}
		Node.noOfNodes--;
		
	}
	
	public void print() {
		current = head;
		while (current!=null) {
			System.out.println(current.data);
			current = current.nextNode;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Here's the linkedList:");
		
		theList LinkedList = new theList();
		
		LinkedList.addNode(10);
		LinkedList.addNode(20);
		LinkedList.addNode(30);
		LinkedList.addNode(40);
		LinkedList.deleteNode(2);
		
		LinkedList.print();
		
		System.out.println("number of nodes is " + Node.noOfNodes);
		
	}

}
