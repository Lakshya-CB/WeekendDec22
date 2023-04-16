package Lec_27;

public class Inher_client {
	public static void main(String[] args) {
//		C obj1 = new C();
//		System.out.println(obj1.data);
		P obj1 = new P(); // C1
		System.out.println(obj1.data);
		System.out.println(obj1.dataP);
		System.out.println("==============");
//		///////////
		P obj2 = new C();
//		System.out.println(obj2.data);
////		System.out.println(obj2.dataP);
//		System.out.println(((C)obj2).data);
//		System.out.println(((C)obj2).dataC);
		obj2.fun();
		((C)obj2).fun();
		
		
//		System.out.println("==============");
////		///////////
//		C obj3 = new C();
//
//		System.out.println(obj3.data);
//		System.out.println(((P)obj3).data);
	/////////////////////////////
		C obj4 = new P();
	}
}
