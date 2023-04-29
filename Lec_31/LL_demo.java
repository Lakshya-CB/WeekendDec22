package Lec_31;

public class LL_demo {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.createCycle();
		System.out.println(LL.detectCycle());
		LL.print();
//		LL.breakCycle();
//		System.out.println(LL.detectCycle());
//		LL.print();
		
	}
}
