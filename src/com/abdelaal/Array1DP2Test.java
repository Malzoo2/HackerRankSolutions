package com.abdelaal;

import java.util.*;

public class Array1DP2Test {

	private static int checkIndex(int[] game, int index) {
		int rVal = -1;
		try {
			rVal = game[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			rVal = -1;
		}
		return rVal;

	}

	public static boolean canWin(int leap, int[] game) {
		boolean moveBack = false, moveForward = false, moveLeap = false, retRes = false;
		int n = game.length;
		int destF = 1, destL = 1;
		for (int i = 0; i < n; i++) {
			
			moveBack = checkIndex(game, i - 1) != -1 && game[i - 1] == 0 ? true : false;
			moveForward = checkIndex(game, i + 1) != -1 && game[i + 1] == 0 ? true : false;
			moveLeap = checkIndex(game, i + leap) != -1 && game[i + leap] == 0 ? true
					: checkIndex(game, i + leap) == -1 && (i + leap) >= n ? true : false;
//
			destF = moveForward ? game[i+1] : 1;
			destL = moveLeap ? game[i+leap] : 1;

			if (moveBack && moveLeap && moveForward) {
				retRes = true;
				break;
			}

		}

//		System.out.print("--------------------------");

		return retRes;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}

}
