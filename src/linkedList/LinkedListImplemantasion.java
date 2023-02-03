package linkedList;

public class LinkedListImplemantasion {
	Node head;
	static int i = 0;

	class Node {
		public Node next;
		String data;

		Node(String data) {
			this.data = data;
			this.next = null;
		}

	}

	// add first
	void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	// end add first-----

	// add Last
	void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;

		}
		Node currentNode = head;

		while (currentNode.next != null) {

			currentNode = currentNode.next;
			i = i + 1;

		}
		System.out.println(i);

		currentNode.next = newNode;

	}
	// end add last-------

	// Show List

	void showData() {
		if (head == null) {
			System.out.println("list is empti !!");
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + "-->");
			currentNode = currentNode.next;

		}
		System.out.println("");


	}

	void deleteFirst() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		head = head.next;
	}

	// delete list element
	void deleteLast() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		if (head.next == null) {
			head = null;
		}
		Node lastNode = head.next;
		Node secondLastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLastNode = secondLastNode.next;
		}
		secondLastNode.next = null;

	}

	public static void main(String[] args) {

		LinkedListImplemantasion list = new LinkedListImplemantasion();
		list.addFirst("may");

		list.addFirst("may");
		list.addLast("love");

		list.addLast("is");

		list.addLast("");
		list.addLast("!!");
		list.addLast("!!");

		list.showData();
		list.deleteFirst();
		list.showData();
		list.deleteLast();
		list.showData();


	}

}
