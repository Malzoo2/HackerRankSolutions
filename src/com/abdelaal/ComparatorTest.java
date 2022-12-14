package com.abdelaal;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.*;


class Checker<T extends Player> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		if (o1.score == o2.score)
			return o1.name.compareTo(o2.name);
		else
			return o2.score - o1.score;	
	}
	
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class ComparatorTest {

	private static String readLine(BufferedReader bf) throws IOException {
		return bf.readLine().replaceAll("\\s+$", "");
	}
	public static void main(String[] args) throws IOException{
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();

	        Player[] player = new Player[n];
	        Checker checker = new Checker();
	        
	        for(int i = 0; i < n; i++){
	            player[i] = new Player(scan.next(), scan.nextInt());
	        }
	        scan.close();

	        Arrays.sort(player, checker);
	        for(int i = 0; i < player.length; i++){
	            System.out.printf("%s %s\n", player[i].name, player[i].score);
	        }

	}

}
