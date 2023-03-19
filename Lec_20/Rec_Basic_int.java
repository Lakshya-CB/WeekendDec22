package Lec_20;

public class Rec_Basic_int {
	public static void main(String[] args) {
		
		
	}
	public static int pow(int a, int b) {
		if(b==0) {
			return 1;
		}
//		BP : pow(a,b)
//		SP : pow(a,b/2);
		int sp = pow(a,b/2);
		if(b%2==0) {
			return sp*sp;
		}else {
			return sp*sp*a;
		}
	}
	public static int Fibo(int i) {
//		BP : F(i)
//		SP : F(i-1) and F(i-2)
		int sp1 = Fibo(i-1);
		int sp2 = Fibo(i-2);
		return sp1+sp2;
	}
}
