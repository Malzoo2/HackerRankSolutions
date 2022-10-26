package com.abdelaal;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ContentExtractorTest {

	private static final Pattern Tags_Pattern =  Pattern.compile("<(.+)>([\\w]+[^<]*)</(\\1)>");
	
	private static void getBetweenTags(String line) {
		final Matcher matcher = Tags_Pattern.matcher(line);
		boolean isFound = false;
		while (matcher.find()) {
			System.out.println(matcher.group(2));
			isFound = true;
		}
		if (isFound)
		System.out.println("None");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();						
			getBetweenTags(line);

			testCases--;
		}
	}

}
