package com.abdelaal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class BigSetTest {
	static String operation = "";
	static int set1 = 0;
	static int set2 = 0;

	private static void rebuildClassVars(String line) {
		String[] segments = line.split(" ");
		operation = segments[0];
		set1 = Integer.parseInt(segments[1]);
		set2 = Integer.parseInt(segments[2]);
	}

	public static void main(String[] args) throws IOException {

//		int cc = 10;
//		String resultWithPadding = String.format("%8s", Integer.toBinaryString(cc)).replaceAll(" ", "0");
//		System.out.println(resultWithPadding);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().replaceAll("\\s+$", "").trim().split(" ");
		int N = Integer.parseInt(str[0]), M = Integer.parseInt(str[1]);
		BitSet B1 = new BitSet(N);
		BitSet B2 = new BitSet(N);

		String line = "";
		for (int i = 0; i < M; i++) {
			line = br.readLine().replaceAll("\\s+$", "");
			rebuildClassVars(line);
			switch (operation) {
				case "AND": {
					if (set1 == 1 ) B1.and(B2);		
					if (set1 == 2 ) B2.and(B1);
					break;
				}
				case "OR": {
					if (set1 == 1 ) B1.or(B2);		
					if (set1 == 2 ) B2.or(B1);					
					break;
				}
				case "XOR": {
					if (set1 == 1 ) B1.xor(B2);		
					if (set1 == 2 ) B2.xor(B1);
					break;
				}
				case "SET": {
					if (set1 == 1 ) B1.set(set2, true);
					if (set1 == 2 ) B2.set(set2, true);
					break;
				}
				case "FLIP": {
					if (set1 == 1 ) B1.flip(set2);
					if (set1 == 2 ) B2.flip(set2);
					break;
				}
			}
			
			System.out.print(operation+" ");
			System.out.print(B1.cardinality());
			System.out.print(" ");
			System.out.print(B2.cardinality());
			System.out.print("\n");
		}

		br.close();
	}

}
