package linkedList;

public class theList3 {
	static Node3 current;
	static Node3 temp;
	static Node3 head;
	
	public void addNode(int data) {
		Node3 node = new Node3(data);
		
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
	
	public void insertNode(int data, int position) {
		Node3 node = new Node3(data);
		current = head;
		int temporary = 1;
		
		if (position == 0) {		//to add node before the head
			head = node;
			head.nextNode = current;
			current = head;
		}
		
		else {
			while (temporary!= position) {
				current = current.nextNode;
				temporary++;
			}
			temp = current.nextNode;
			current.nextNode = node;
			node.nextNode = temp;
			
		}	
	}
	
	public void deleteNode(int position) {
		current = head;
		int temporary = 1;
		
		if (position == 1) {
			head = current.nextNode;
			current = head;
		}
		else {
			while (temporary!= position-1) {
				current = current.nextNode;
				temporary++;
			}
			current.nextNode = current.nextNode.nextNode;
		}
		Node3.numberOfNodes--;
	}
	
	public void print() {
		current = head;
		
		while (current!=null) {
			System.out.println(current.data);
			current = current.nextNode;
		}
	}
	
	public void middleElement() {
		current = head;
		if (Node3.numberOfNodes%2 != 0)  {
			int position = (Node3.numberOfNodes)/2;
			position = position +1;
			
			int temporary = 1;
			
			while (temporary!=position) {
				current = current.nextNode;
				temporary++;
			}
			System.out.println(current.data);
		}
	}
	
	public void reserveList() {
		
		int length = Node3.numberOfNodes-2;	//4 but 3
		Node3 temp1;
		Node3 temp2;
		
		current = head;					//100
		temp1 = current;				//100
		temp2 = current.nextNode;		//200
		current.nextNode = null;		//0
		current = temp2;				//200
		
		for (int i = 0; i < length; i++) {
			temp2 = current.nextNode;	//400			//300			//null
			current.nextNode = temp1;	//100			//200			//400
			temp1 = current;			//200			//400			//300
			current = temp2;			//400			//300			//null
		}
		current.nextNode = temp1;
		head = current;
		
	}
	public static void main(String[] args) {
		theList3 list = new theList3();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(10);
		list.addNode(8);
		
		
		list.insertNode(10, 0);
		list.insertNode(11, 4);
		list.deleteNode(1);
		list.reserveList();
		list.print();
		//list.middleElement();
		//list.print();
		//System.out.println("---------------");
		//System.out.println("Number of nodes: "+ Node3.numberOfNodes);
		
	}
}
