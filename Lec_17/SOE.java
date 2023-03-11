package Lec_17;

import java.util.Arrays;

public class SOE {
//sieve Of Eratosthenes
	public static void main(String[] args) {
		int N = 25;

		boolean[] isPrime = new boolean[N + 1];
		Arrays.fill(isPrime, true);

		for (int div = 2; div * div <= N; div++) {
			if (isPrime[div]) {
				for (int table = div * div; table <= N;
						table = table + div) {
					isPrime[table] = false;
				}
			}
		}
		for(int num = 2;num<=N;num++) {
			if(isPrime[num]) {
				System.out.println(num);
			}
		}
	}

}
