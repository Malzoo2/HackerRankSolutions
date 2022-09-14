package com.abdelaal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerClass {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String firstNum = bf.readLine().replaceAll("\\s+$", "");
		String secondNum = bf.readLine().replaceAll("\\s+$", "");
		BigInteger biF = new BigInteger(firstNum);
		BigInteger biS = new BigInteger(secondNum);
		System.out.println(biF.add(biS).toString());
		System.out.println(biF.multiply(biS).toString());
		bf.close();

	}

}
