package Lec_30;

public class LL_demo {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(40);
		LL.add(50);
		LL.add(60);
		LL.add(70);
		LL.add(80);
		LL.add(90);
		
		LL.print();
//		LL.rev2();
		LL.kRev(3);
		LL.print();
	}
}
