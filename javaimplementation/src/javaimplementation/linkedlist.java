package javaimplementation;

public class linkedlist {

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node head;
	public static Node tail;
	public static int size;

	public static void printll() {
		if (head == null) {
			System.out.println("the linked list is empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");

	}

	public static void addfirst(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = tail = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}

	public static void addlast(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = tail = newnode;
			return;
		}

		//
		newnode.next = null;
		tail = newnode;
	}

	public static void addmiddle(int data, int idx) {
		Node newnode = new Node(data);
		int i = 0;
		Node temp = head;
		while (i < idx - 1) {
			temp = temp.next;
			i++;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}

	public static void llrev() {
		Node prev = null;
		Node curr = head;
		Node next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	public static void removenthnode(int idx) {
		int sz = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			sz++;
		}
		if (idx == sz) {
			head = head.next;
			return;
		}
		Node prev = head;
		int itofind = sz - idx;
		int i = 1;
		while (i < itofind) {
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		return;

	}

	public Node findmid(Node head) {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public boolean pallindrome() {
		if (head == null || head.next == null) {
			return true;
		}
		// finding the middle node
		Node mid = findmid(head);
		// reverse 2nd half of the array
		Node curr = mid;
		Node prev = null;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node right = prev;
		Node left = head;
		while (right != null) {
			if (left.data != right.data) {
				return false;
			}
			left = left.next;
			right = right.next;

		}
		return true;
	}

	public static Node generatecylell(Node head) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
			temp.next = head;

		}
		return head;
	}

	public static boolean iscycle(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		linkedlist ll = new linkedlist();
		linkedlist ll2 = new linkedlist();
		for (int i = 5; i >= 1; i--) {
			ll.addfirst(i);
		}
		ll.printll();

	}

}
