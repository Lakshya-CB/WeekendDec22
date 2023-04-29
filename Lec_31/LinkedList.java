package Lec_31;

import java.util.Stack;

public class LinkedList {
	class Node {
		public Node(int ali) {
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int cnt = 0;
		Node temp = head;
		while (temp != null) {
			cnt++;
			temp = temp.next;
		}
		return cnt;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		if (idx < 0 || idx >= size()) {
			throw new IndexOutOfBoundsException("???");
		}
		Node temp = head;
		for (int cnt = 1; cnt <= idx; cnt++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getAtNode(int idx) {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		if (idx < 0 || idx >= size()) {
			throw new IndexOutOfBoundsException("???");
		}
		Node temp = head;
		for (int cnt = 1; cnt <= idx; cnt++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addLast(int ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node nn = new Node(ali);
		Node last = getAtNode(size() - 1);
		last.next = nn;
	}

	public void add(int ali) {
		addLast(ali);
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		if (isEmpty()) {
			head = nn;
			return;
		}
		head.next = nn;
		head = nn;
	}

	public void addAt(int ali, int idx) {
		if (idx == 0) {
			addFirst(ali);
		}
		if (idx < 0 || idx > size()) {
			throw new IndexOutOfBoundsException("???");
		}
		Node prev = getAtNode(idx - 1);
		Node after = prev.next;
		Node curr = new Node(ali);
		prev.next = curr;
		curr.next = after;

	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		int ans = head.data;
		head = head.next;
		return ans;
	}

	public int removeLast() {

		if (size() <= 1) {
			return removeFirst();
		}
		Node secondLast = getAtNode(size() - 2);
		Node last = secondLast.next;
		int ans = last.data;
		secondLast.next = null;
		return ans;
	}

	public int removeAt(int idx) {
		if (idx <= 0) {
			return removeFirst();
		}
		if (idx >= size() - 1) {
			return removeLast();
		}

		Node prev = getAtNode(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;

		prev.next = after;
		return curr.data;

	}

	public void rev() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node after = curr.next;

			curr.next = prev;

			prev = curr;
			curr = after;
		}
		head = prev;
	}

	public void rev2() {
		Node temp = head;
		rev2(head);
		temp.next = null;
	}

	private void rev2(Node prev) {
		if (prev.next == null) {
			head = prev;
			return;
		}
		rev2(prev.next);
		Node curr = prev.next;
		curr.next = prev;
	}

	public void kRev(int k) {
		Stack<Node> S = new Stack<Node>();
		Node curr = head;
		Node new_Head = null;
		Node new_Tail = null;
		while (curr != null) {
			Node after = curr.next;
			S.add(curr);
			if (S.size() == k) {
				while (!S.isEmpty()) {
					Node nn = S.pop();
					if (new_Head == null) {
						new_Head = nn;
						new_Tail = nn;
					} else {
						new_Tail.next = nn;
						new_Tail = nn;
					}
				}

			}
			curr = after;
		}
		new_Tail.next = null;
		head = new_Head;

	}

	public Node reverseKGroup(Node head, int k) {
		if (head == null) {
			return null;
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			if (temp == null) {
				return head;
			}
			temp = temp.next;
		}
		Node sp = reverseKGroup(temp, k);

		Node prev = null;
		Node curr = head;
		for (int i = 0; i < k; i++) {
			Node after = curr.next;

			curr.next = prev;

			prev = curr;
			curr = after;
		}
		head.next = sp;
		return prev;
	}

	public int midd() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int KthLast(int k) {
		Node aage = head;
		Node peeche = head;
		for (int i = 0; i < k; i++) {
			aage = aage.next;
		}
		while (aage != null) {
			aage = aage.next;
			peeche = peeche.next;
		}
		return peeche.data;
	}

	public void createCycle() {
		for (int i = 1; i <= 9; i++) {
			this.add(i);
		}
		Node temp = this.getAtNode(3);
		Node last = this.getAtNode(this.size() - 1);
		last.next = temp;
	}

	public Node getIntersectionNode(Node headA, Node headB) {
		Node car1 = headA;
		Node car2 = headB;
		while (car1 != car2) {
			car1 = car1.next;
			car2 = car2.next;

			if (car1 == car2) {
				return car1;
			}
			if (car1 == null) {
				car1 = headB;
			}
			if (car2 == null) {
				car2 = headA;
			}

		}
		return car1;
	}

	public boolean detectCycle() {
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

	public void breakCycle() {
		Node slow = head;
		Node fast = head;
		while (true) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		Node start = head;
		Node special = slow;
		while (start.next != special.next) {
			start = start.next;
			special = special.next;
		}
		special.next = null;
	}
}
