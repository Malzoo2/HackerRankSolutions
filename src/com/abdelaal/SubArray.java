package com.abdelaal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SubArray {
	static int sum;
	private static int sumNumbers (List<Integer> elements, int startIndex, int end) {				
		IntStream
		.range(startIndex, end+1)
		.forEach(x ->  {sum+=elements.get(x);});
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {        
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int arraySize = Integer.parseInt(bf.readLine());		
		List<Integer> elements = Stream.of(bf.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());		
		int counter =0;		
		for (int range = 1; range <= elements.size(); range++) {			
			for (int j = 0; (j+range) <= elements.size(); j+=1) {				
				sum = sumNumbers(elements, j,(j+range)-1);				
				if (sum<0)counter++;
				sum=0;
			}			
		}
		System.out.println(counter);		
    }
}
