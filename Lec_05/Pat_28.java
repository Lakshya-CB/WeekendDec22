package Lec_05;

public class Pat_28 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		int total_sp = n - 1;
		int total_st = 1;
		int row_num = n;
		while (row <= n) {
			int curr_sp = 0;
			while (curr_sp < total_sp) {
				System.out.print("  ");
				curr_sp++;
			}
			int num = row_num;
			int curr_st = 0;
			while (curr_st < total_st) {
				System.out.print(num%10 + " ");
				if (curr_st < total_st / 2) {
					num++;
				} else {
					num--;
				}
				curr_st++;
			}
			System.out.println();
			row++;
			total_st = total_st + 2;
			total_sp--;
			row_num--;
		}
	}
}
