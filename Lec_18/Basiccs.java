package Lec_18;

public class Basiccs {
	public static void main(String[] args) {
//		PD(3);
//		PI(3);
		PDI(4);
	}

	public static void PD(int n) {
//		BP : PD(n)
//		SP : PD(n-1)
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PD(n - 1);
	}

	public static void PI(int n) {
//		BP : PI(n)
//		SP : PI(n-1)
		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);
	}

	public static void PDI(int n) {
//		BP : PDI(n)
//		SP : PDI(n-1)
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PID(int s, int e) {
//		BP : s se e and e se s
//		SB : s+1 se e and e se s+1

		PID(s + 1, e);
	}
}
