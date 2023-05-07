package Lec_34;

import java.util.Stack;

public class LinkedList <Y> {
	class Node {
		public Node(Y ali) {
			data = ali;
		}

		Y data;
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

	public Y getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		return head.data;
	}

	public Y getLast() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public Y getAt(int idx) {
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

	public void addLast(Y ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node nn = new Node(ali);
		Node last = getAtNode(size() - 1);
		last.next = nn;
	}

	public void add(Y ali) {
		addLast(ali);
	}

	public void addFirst(Y ali) {
		Node nn = new Node(ali);
		if (isEmpty()) {
			head = nn;
			return;
		}
		head.next = nn;
		head = nn;
	}

	public void addAt(Y ali, int idx) {
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

	public Y removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		Y ans = head.data;
		head = head.next;
		return ans;
	}

	public Y removeLast() {

		if (size() <= 1) {
			return removeFirst();
		}
		Node secondLast = getAtNode(size() - 2);
		Node last = secondLast.next;
		Y ans = last.data;
		secondLast.next = null;
		return ans;
	}

	public Y removeAt(int idx) {
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
}
