package com.abdelaal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HashSetTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Set<String> names = new HashSet<String>();		
		int loopCounter = Integer.parseInt(bf.readLine().replaceAll("\\s+$", ""));
		String line = "";		
		while (loopCounter>0) {
			line = bf.readLine().replaceAll("\\s+$", "");
			names.add(line);
			System.out.println(names.size());
			loopCounter--;
		}
		
		bf.close();
		
		

	}

}
