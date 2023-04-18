package Lec_29;

public class Dynamic_Stack extends Stack {
	int tos = 99;
	public void add(int ali) {
		if (this.isFull()) {		
			int[] biggy = new int[this.arr.length * 2];
			for(int i=0;i<arr.length;i++) {
				biggy[i] = arr[i];
			}
			this.arr = biggy;
		}
		super.add(ali);
	}
}
