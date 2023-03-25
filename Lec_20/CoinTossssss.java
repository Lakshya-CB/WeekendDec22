package Lec_20;

public class CoinTossssss {
	public static void main(String[] args) {
//		CT(3, "");
		CT(3, "", false);
	}

	public static void CT(int n, String path) {
//		BP : CT
//		SP : CT(n-1,path)
		if (n == 0) {
			System.out.println(path);
			return;
		}
		CT(n - 1, path + "H");
		CT(n - 1, path + "T");

	}

	public static void CT(int n, String path, boolean isHead) {
//		BP : CT
//		SP : CT(n-1,path)
		if (n == 0) {
			System.out.println(path);
			return;
		}
		if (isHead == false) {
			CT(n - 1, path + "OO", true);
		}
		CT(n - 1, path + "OOO", false);

	}

}
