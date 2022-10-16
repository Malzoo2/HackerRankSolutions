package com.abdelaal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Test {
	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alphaNumericStr =  br.readLine().replaceAll("\\s+$", "");
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(alphaNumericStr.getBytes());
		byte [] digest = md.digest();
		BigInteger no = new BigInteger(1, digest);
		System.out.println(no.toString(16));
		br.close();
	}

}
