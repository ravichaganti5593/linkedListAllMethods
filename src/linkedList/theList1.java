package linkedList;

public class theList1 {
	static Node1 current;		//traversing
	static Node1 temp; 			//to store temp values
	static Node1 head; 			//constant which is the head of the node
	
	public void addNode(int data) {
		Node1 node = new Node1(data);
		
		if (head == null) {
			head = node;
			head.nextNode = null;
		}
		
		else {
			current = head;
			while (current.nextNode != null) {
				current = current.nextNode;
			}
			current.nextNode = node;
			node.nextNode = null;
		}
	}
	
	public void insertNode (int data, int position) {
		Node1 node = new Node1(data);
		current = head;
		int tempPosition = 1;
		
		if (position == 0) {
			head = node;
			head.nextNode = current;
			current = head;
		}
		else {
			while (position != tempPosition) {
				current = current.nextNode;
				tempPosition++;
			}
			temp = current.nextNode;
			current.nextNode = node;
			node.nextNode = temp;
			
		}
		
	}
	public void deleteNode(int position) {
		current = head;
		int tempPosition = 1;
		
		if (position == 1) {
			current = current.nextNode;
		}
		else {
			while (tempPosition != position-1) {
				current = current.nextNode;
				tempPosition++;
			}
			current.nextNode = current.nextNode.nextNode;
		}
		Node.noOfNodes--;
	}
	
	public void reverseList() {
		current = head;
		while (current.nextNode!=null) {
			temp = current.nextNode;
			
		}
	}
	
public void print(){
		
		current = head;
		
		while(current!=null){		
			System.out.println(current.data);
			current = current.nextNode;
			
		}
		
	}
	
	public static void main (String[] args) {
		theList1 list = new theList1();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		//list.insertNode(50, 0);
		
		list.deleteNode(1);
		
		list.print();
		System.out.println("-------------------");
		System.out.println("Number of nodes are " + Node1.noOfNodes);
	}
}
