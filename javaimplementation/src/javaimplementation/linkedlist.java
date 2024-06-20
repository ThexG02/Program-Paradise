package javaimplementation;
import java.util.*;


public class linkedlist {
    //CLASS FOR NODE GENERATION
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	//STATIC NODES HEAD , TAIL FOR TRVERSING IN THE LINKED LIST 
	public static Node head;
	public static Node tail;
	public static int size;
	

	// FUNCTION TO PRINT THE LINKED LIST
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
	
	// FUNCTION TO ADD A NODE IN THE BEGINING OF THE LL
	public static void addfirst(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = tail = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}

	//FUNTION TO ADD A NODE IN THE END OF THE LL
	public static void addlast(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = tail = newnode;
			return;
		}
		Node cur =head;
		while (cur.next!=null) {
			cur=cur.next;
		}
		newnode.next = null;
		tail = newnode;
	}

	// FUNCTION TO ADD A NODE IN THE MIDDLE OF THE LL
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

	//FUNCTION TO ADD A NODE IN THE MIDDLE OF THE LL USING TWO POINTER APPROACH
	public void addmidle2(int pos, int data){
		Node newnode = new Node(data);
		Node cur =head;
		Node prev = null;
		while (cur != null && pos>1){
           prev=cur;
           cur=cur.next;
           pos--;
		}
		if(pos==1){
			prev.next= newnode;
			newnode.next= cur;
		}
		else{
			System.out.println("short ll");
		}
	}
	
	//FUNCTION TO REVERSE THE LL
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

	//FUNCTION TO REMOVE THE nth NODE FROM END
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
    
	// DELETION OF NODE ANYWHERE
	public static void delanyw(int pos){
		Node cur =head;
		Node prev = null;
		while(cur!= null && pos>1){
			prev=cur;
			cur =cur.next;
			pos--;
		}
		if(pos==1){
			prev.next=cur.next;
		}
	}

	// FUNTION TO FIND THE MIDDLE OF THE LL 
	public Node findmid(Node head) {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	

	//FUNCTION TO CHECK WHEATHER THE LL IS PALINDROME
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


	// FUNCTION TO GENERATE A CYCLE IN A LL
	public static Node generatecylell(Node head) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
			temp.next = head;

		}
		return head;
	}

	// FUNCTION TO CHECK THE PRESENCE OF  CYCLE IN LL
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
	
	//MAIN FUNCTION

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//linkedlist ll = new linkedlist();

		linkedlist ll2 = new linkedlist();
		for (int i = 1; i <=5 ; i++) {
			linkedlist.addfirst(i);		
			size++;
		}

		linkedlist.printll();
		System.out.println();
		//System.out.println(size);
		// ll2.addmiddle(11, 3);
		// ll2.printll();
        int a = sc.nextInt();
		ll2.addmidle2(4,a);
		System.out.println();
		linkedlist.printll();
		System.out.println();
		linkedlist.delanyw(4);
		linkedlist.printll();
	}

}
