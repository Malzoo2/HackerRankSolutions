package com.abdelaal;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Array {
	
	
	static int getMaxSum(int [][]arr)
	{
		 int sum=-63;
		 
	        for(int p=5; p>=2; p--) {
	            for(int q=5; q>=2; q--){
	 
	                int  sum_hg = arr[p][q]+arr[p][q-1]+arr[p][q-2];
	                sum_hg += arr[p-1][q-1];
	                sum_hg += arr[p-2][q]+arr[p-2][q-1]+arr[p-2][q-2];
	 
	                if(sum_hg>sum) sum=sum_hg;
	            }
	        }
	    return sum;
	}
	
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int [][] arrRaw = new int [6][6];       
     
        for (int i = 0; i < arr.size(); i++) {
        	List<Integer> list = arr.get(i);
        	arrRaw[i] =list.stream().mapToInt(Integer::intValue).toArray();
		}
        
        System.out.println(getMaxSum(arrRaw));
    }

}