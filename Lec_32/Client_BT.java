package Lec_32;

public class Client_BT {
	public static void main(String[] args) {
		int[] pre = {10,20,40,-1,-1,50,-1,-1,30,-1,70};
		BTree BT = new BTree(pre);
		BT.print();
		System.out.println(BT.size());
		System.out.println(BT.Ht());
		System.out.println(BT.Dia2());
		
	}
}
