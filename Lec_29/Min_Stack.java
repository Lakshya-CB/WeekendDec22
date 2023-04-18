package Lec_29;

public class Min_Stack extends Dynamic_Stack {
	int curr_min = 0;

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		int temp = super.peek();
		if (temp < curr_min) {// Magiiical number
			return curr_min;
		} else {
			return temp;
		}
	}

	@Override
	public void add(int ali) {
		if(this.isEmpty()) {
			curr_min = ali;
			super.add(ali);
			return;
		}
		
		if (ali < curr_min) {
			int prev_min = curr_min;
			curr_min = ali;
			int Magical = 2*curr_min-prev_min;
			super.add(Magical);
		}else {
			super.add(ali);
		}
	}
	@Override
	public int pop() {
		int temp = super.pop();
		if (temp < curr_min) {// Magiiical number
			int ans = curr_min;
			
			int Magical = temp;
//			i know curr_min, Magical!!
			int prev = 2*curr_min-Magical;
			
			curr_min = prev;
			
			
			return ans;
			
		}else {
			return temp;
		}
		
	}
}
