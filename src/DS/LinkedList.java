package DS;

class Node {
	int data;
	Node next;
}

class LinkedListCreation {
	Node head;

	public void insert(int i) {

		Node node = new Node();
		node.data = i;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n= n.next;
			}
			n.next=node;

		}
	}
	public void show() {
		
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node =  node.next;
		}
		System.out.println(node.data);
	}

}

public class LinkedList {

	public static void main(String[] args) {

		LinkedListCreation link = new LinkedListCreation();

		link.insert(10);
		link.insert(15);
		link.insert(20);
		link.insert(30);
		
		link.show();

	}

}
