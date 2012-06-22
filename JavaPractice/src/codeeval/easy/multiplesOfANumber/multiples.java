package codeeval.easy.multiplesOfANumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Given numbers x and n, where n is a power of 2, 
 * print out the smallest multiple of n which is greater 
 * than or equal to x. Do not use division or modulo operator.
 * 
 * @author louis lu
 */
public class multiples {
	
	/*
	 * the return value >= x and is multiple of n
	 */
	static long findSmallestMultiple(long x, long n){
		if(x <= n)
			return n;
		else
			return (x + n - x % n); 
	}
	
	public static void main (String[] args) {

	    try {
	        File file = new File(args[0]);
	        BufferedReader in = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = in.readLine()) != null) {
	            String[] lineArray = line.split(",");
	            if (lineArray.length > 0) {
	            	long x = Long.valueOf(lineArray[0]);
	            	long n = Long.valueOf(lineArray[1]);
	            	long result = findSmallestMultiple(x, n);
	            	System.out.println(result);
	            } 
	        }
	    } catch (IOException e) {
	        System.out.println("File Read Error: " + e.getMessage());
	    }               
	}
}