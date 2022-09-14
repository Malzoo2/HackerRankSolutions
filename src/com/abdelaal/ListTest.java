package com.abdelaal;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListTest {
	static final String INSERT = "Insert";
	static final String DELETE = "Delete";

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = new ArrayList<>();
		int arrayElemetsSize = Integer.parseInt(bufferedReader.readLine());
		String[] lineElements = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		arr = Stream.of(lineElements).map(Integer::parseInt).collect(Collectors.toList());

		arrayElemetsSize = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < arrayElemetsSize; i++) {
			String opName = bufferedReader.readLine();			
			lineElements = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
			List<Integer> values =Stream.of(lineElements).map(Integer::parseInt).collect(Collectors.toList());
			switch (opName) {
			case INSERT:
				arr.add(values.get(0), values.get(1));
				break;
			case DELETE:
				arr.remove(values.get(0).intValue());
				break;
			}
		}
		String arrStr = arr.toString();
		System.out.println(arrStr.substring(1, arrStr.length()-1).replaceAll(",", ""));
		bufferedReader.close();
	}

}
