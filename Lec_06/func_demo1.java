package Lec_06;

public class func_demo1 {
	public static void add() {
		System.out.println("naacho!!");
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		add();
//		int ans = add(10, 22, 90);
//		System.out.println(ans);
		System.out.println(Math.pow(2, 10));
		System.out.println(add(2, 10,12));

	}

	public static void partyy(int A, int B) {
		System.out.println(A + B);
	}

}
