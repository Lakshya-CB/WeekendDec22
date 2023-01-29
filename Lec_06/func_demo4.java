package Lec_06;

public class func_demo4 {
	static int val = 100;

	public static void main(String[] args) {
		System.out.println(val);
		fun(20);
		System.out.println(func_demo4.val);
	}

	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(func_demo4.val);
		val = val + 60;
		func_demo4.val = val + 10;
		System.out.println(val);
		System.out.println(func_demo4.val);
	}

}
