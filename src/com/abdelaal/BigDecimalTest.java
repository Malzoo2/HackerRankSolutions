package com.abdelaal;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;


public class BigDecimalTest {
	
	static void orderArray (String [] s) {
	Arrays.sort(s, Collections.reverseOrder(Comparator.comparing(BigDecimal:: new)));
	}

	  public static void main(String []args){
	        //Input
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	        sc.close();

	        //Write your code here
	        orderArray(s);
	        //Output
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
	    }
	}