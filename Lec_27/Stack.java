package Lec_27;

public class Stack {
	private int[] arr;
	private int tos;

	Stack(int n) {
		arr = new int[n];
		tos = -1;
	}
	Stack(){
		this(5);
	}
	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("full hu bhai");
		}
		tos++;
		arr[tos] = ali;
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("khali hu bhai");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("abe kya deekh rha hien?");
		}
		return arr[tos];
	}
	public int size() {
		return tos+1;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public boolean isFull() {
		return size()==arr.length;
	}
}
