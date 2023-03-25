package Lec_21;

public class Generate_parenth {
	public static void main(String[] args) {
		suvle(5, 5, "");
	}

	public static void suvle(int op, int cl, String path) {
		if (op == 0 && cl == 0) {
			System.out.println(path);
			return;
		}
		if(op>cl) {
			return;
		}
		if (op > 0) {
			suvle(op - 1, cl, path + "(");
		}
		if (cl > 0) {
			suvle(op, cl - 1, path + ")");
		}
	}
}
