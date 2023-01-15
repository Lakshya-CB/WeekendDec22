package Lec_04;

public class Pat_18 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int total_sp = n / 2;
		int total_st = 1;
		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}

			int cnt_st = 0;
			while (cnt_st < total_st) {
				if (cnt_st == 0||cnt_st == total_st-1 ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
					
				}
				cnt_st++;
			}

			System.out.println();
			row++;
			if (row <= n / 2 + 1) {
				total_sp = total_sp - 1;
				total_st = total_st + 2;
			} else {
				total_sp = total_sp + 1;
				total_st = total_st - 2;
			}
		}
	}
}
