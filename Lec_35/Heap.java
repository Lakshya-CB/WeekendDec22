package Lec_35;

import java.util.ArrayList;

public class Heap {
	ArrayList<Integer> AL;

	public Heap() {
		// TODO Auto-generated constructor stub
		AL = new ArrayList<>();
	}

	public int size() {
		return AL.size();
	}

	public int peek() {
		return AL.get(0);
	}

	public void add(int ali) {
		AL.add(ali);
		upheapify(AL.size() - 1);
	}

	private void upheapify(int ch) {
		int p = (ch - 1) / 2;
		if (AL.get(p) > AL.get(ch)) {
//			swap!! p and ch!!
			swap(ch, p);
			upheapify(p);
		}
	}

	private void swap(int a, int b) {
		int temp = AL.get(a);
		AL.set(a, AL.get(b));
		AL.set(b, temp);
	}

	public int poll() {
		int ans = AL.get(0);

		AL.set(0, AL.get(AL.size() - 1));
		AL.remove(AL.size() - 1);

		downHeapify(0);
		return ans;
	}

	private void downHeapify(int p) {
		int L = 2 * p + 1;
		int R = 2 * p + 2;
		int min_idx = p;
		if (L < AL.size() && AL.get(L) < AL.get(min_idx)) {
			min_idx = L;
		}
		if (R < AL.size() && AL.get(R) < AL.get(min_idx)) {
			min_idx = R;
		}

		if (p != min_idx) {
			swap(p, min_idx);
			downHeapify(min_idx);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return AL+"";
	}
}
