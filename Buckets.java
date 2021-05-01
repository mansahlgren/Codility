package main;

import java.util.HashMap;
import java.util.Map;

/**
 * Buckets https://app.codility.com/programmers/task/buckets/
 * 
 * @author Mans
 *
 */

public class Buckets {

	public static int solution(int N, int Q, int[] B, int[] C) {

		Map<Integer, HashMap<Integer, Integer>> bucketsMap = new HashMap<Integer, HashMap<Integer, Integer>>();

		Map<Integer, Integer> colorMap = new HashMap<Integer, Integer>();
		for (int K = 0; K < C.length; K++) { // K represents ball and moment.
			int bucketNbr = B[K];
			int colorNbr = C[K];

			if (!bucketsMap.containsKey(bucketNbr)) {
				bucketsMap.put(bucketNbr, new HashMap<Integer, Integer>());
			}

			colorMap = (Map<Integer, Integer>) bucketsMap.get(bucketNbr);
			if (!colorMap.containsKey(colorNbr)) {
				colorMap.put(colorNbr, 1);// Add first ball of color colorNbr.
			} else {
				colorMap.put(colorNbr, colorMap.get(colorNbr) + 1);
			}
			if (colorMap.get(colorNbr) == Q) {
				return K;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		System.out.println(solution(2, 2, new int[] { 0, 1, 0, 1, 0, 1 }, new int[] { 1, 3, 0, 0, 3, 3 }));
	}

}
