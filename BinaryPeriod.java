package main;

/**
 * Program to find the binary period of an integer.
 * 
 * Definition of a binary period : The period of this string is the smallest
 * positive integer P such that: P ≤ Q / 2 and S[K] = S[K+P] for 0 ≤ K < Q − P.
 * For example, 7 is the period of “abracadabracadabra”. A positive integer M is
 * the binary period of a positive integer N if M is the period of the binary
 * representation of N.
 * 
 * @author Mans
 *
 */

public class BinaryPeriod {

	public static void main(String[] args) {
		int n = 1651;
		String binary = Integer.toBinaryString(n);
		int p = binaryPeriod(n, binary);
		System.out.println(binary);
		System.out.println(p);
	}

	/**
	 * 
	 * @param n The number of find the binary period of.
	 * @return The binary period, if it exists. Else, -1.
	 */

	private static int binaryPeriod(int n, String binary) {

		int binaryLen = binary.length();
		int maxPeriodLen = (int) binaryLen / 2;
		int period = -1;

		// p is the tested period length.
		for (int p = 1; p <= maxPeriodLen; p++) {
			if (hasBinaryPeriod(binary, p, binaryLen)) {
				// Found period.
				return p;
			}
		}
		return period;
	}

	/**
	 * 
	 * @param binary
	 * @param p
	 * @param binaryLen
	 * @return True if the binary representation has a binary period of length p.
	 *         Else, false.
	 */
	private static boolean hasBinaryPeriod(String binary, int p, int binaryLen) {
		for (int k = 0; k < binaryLen - p; k++) {
			if (binary.charAt(k) != binary.charAt(k + p)) {
				return false;
			}
		}
		return true;
	}

}
