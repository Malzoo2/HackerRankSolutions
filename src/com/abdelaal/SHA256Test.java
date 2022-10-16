package com.abdelaal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Test {
	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alphaNumericStr =  br.readLine().replaceAll("\\s+$", "");
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(alphaNumericStr.getBytes(StandardCharsets.UTF_8));
		byte [] digest = md.digest();
		BigInteger no = new BigInteger(1, digest);
		StringBuilder sb = new StringBuilder(no.toString(16));
		
		while (sb.length() < 64)
		sb.insert(0, '0')	;
			
		System.out.println(sb);
		br.close();
	}
}
