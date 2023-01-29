package Lec_06;

public class ArmStrong {
	public static void main(String[] args) {
		printAllArm(1000);
	}

	public static void printAllArm(int num) {
		for (int i = 1; i <= num; i++) {
			if (isArm(i) == true) {
				System.out.println(i);
			}
		}
	}

	public static boolean isArm(int num) {
		int nody = numOfDigit(num);
		int sum = 0;
		int baackup = num;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, nody);
			num = num / 10;
		}
		if (sum == baackup) {
			return true;
		} else {
			return false;
		}
	}

	public static int numOfDigit(int num) {
		int ans = 0;
		while (num > 0) {
			num = num / 10;
			ans++;
		}
		return ans;
	}
}
