package Lec_27;

public class Client_2 {
	public static void main(String[] args) {
		System.out.println(cccc());
	}

	public static int cccc() {
		try {
			System.out.println("nachooo");
			return 10;
		} catch (Exception e) {

		} finally {
			return 9;
		}
	}

}
