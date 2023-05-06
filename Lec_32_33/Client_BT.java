package Lec_32_33;

public class Client_BT {
	public static void main(String[] args) {
//		int[] pre = {10,20,40,50,30,60,100};
//		int[] in = {40,20,50,10,30,100,60};
		int[] lvl = {10,20,30,40,50,-1,60,-1,-1,-1,-1,100,-1,110,120};
		BTree BT = new BTree(lvl,0);
//		BT.print();
		BT.lvlChange2();
//		System.out.println(BT.isBal());
	}
}
