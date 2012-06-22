package codeeval.easy.bitPositions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class position {

	/**
	 * Given a number n and two integers p1,p2 
	 * determine if the bits in position p1 and p2 are the same or not. 
	 * Positions p1,p2 and 1 based.
	 * @param p1
	 * @param p2
	 * @return boolean
	 */
	static boolean isSameBitPosition(int n, int p1, int p2){
		return getBitAtPosition(n, p1) == getBitAtPosition(n, p2);
	}
	
	/**
	 * this method return the bit( 0 or 1) at position p of n
	 * caution: 1 based.
	 * @param n
	 * @param p
	 * @return bit 
	 */
	static int getBitAtPosition(int n, int p){
		if(p - 1 <= 0)
			return n % 2;
		n = n >> (p - 1);
		return n % 2;
	}
	
	public static void main (String[] args) {

	    try {
	        File file = new File(args[0]);
	        BufferedReader in = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = in.readLine()) != null) {
	            String[] lineArray = line.split(",");
	            if (lineArray.length > 0) {
	              int n = Integer.valueOf(lineArray[0]);
	              int p1 = Integer.valueOf(lineArray[1]);
	              int p2 = Integer.valueOf(lineArray[2]);
	              System.out.println(isSameBitPosition(n, p1, p2));
	            } 
	        }
	    } catch (IOException e) {
	        System.out.println("File Read Error: " + e.getMessage());
	    }               
	}

}
