package main;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class WinterSummer {

	public static void main(String[] args) {
		int[] T = new int[] { -5, -5, -5, -42, 6, 12 };
		System.out.println(solution(T));
	}

	public static int solution(int[] T) {

		// T = [-5, 5, -7, 3, 7, -10, 10, -11]
		// N=length of array.

		int winterTMax = T[0];
		int tempMax = T[0];
		int lastWinterTIndex = 0;
		int i;

		for (i = 0; i < T.length; i++) {
			int t = T[i];
			if (t > tempMax) {
				tempMax = t;
			}
			if (t <= winterTMax) {
				lastWinterTIndex = i;
				winterTMax = tempMax;
			}
		}

		return lastWinterTIndex + 1;

	}
}
