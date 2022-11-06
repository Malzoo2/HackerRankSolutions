package com.abdelaal;

import java.util.*;

public class StackTest {
	static Map<Character, Character> openCloseCharacters = new HashMap<>();
	static Stack<Character> st = null;

	static boolean isBalance(String input) {
		Character end = null, current = null, previous = null;
		st =new Stack<>();
		char[] charIn = input.toCharArray();
		for (int i = 0; i < charIn.length; i++) {
			current = Character.valueOf(charIn[i]);
			
			if (i > 0 && i < charIn.length && !st.empty() ) {
				previous = Character.valueOf(st.lastElement());
				end = openCloseCharacters.get(previous) ;	
				
				if (current == end)
					st.pop();
				else st.push(current);
			}
			else st.push(current);
				
			
		}

		return st.empty();
	}

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			intializeOpenClose();
			System.out.println(isBalance(input));
		}
		sc.close();

	}

	static void intializeOpenClose() {
		openCloseCharacters.put(Character.valueOf('{'), Character.valueOf('}'));
		openCloseCharacters.put(Character.valueOf('['), Character.valueOf(']'));
		openCloseCharacters.put(Character.valueOf('('), Character.valueOf(')'));

	}

}
