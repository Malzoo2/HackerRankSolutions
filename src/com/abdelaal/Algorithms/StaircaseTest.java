package com.abdelaal.Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StaircaseTest {

	public static void staircase(int n) {
	    // Write your code here
		char [] spaces = new char [n];
		for (int i = 0; i < spaces.length; i++) 
			spaces[i] = ' ';
		
		
		StringBuilder sb = new StringBuilder() ;
		sb.append(spaces);
		for (int i = 0; i < n; i++) {			
			sb.replace(n-i-1, n-i, "#");			
			System.out.println(sb);
		}
	    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =   Integer.parseInt(br.readLine().replaceAll("\\s+$", ""));
		staircase(n);
		
		br.close();
	}
}


