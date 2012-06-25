package codeeval.easy.sumofdigits;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class sum_digits {
	
	static long getSumOfDigits(long num){
		long sum = 0;
		while(num != 0){
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}
	
	public static void main (String[] args) {
		
	    try {
	        File file = new File(args[0]);
	        BufferedReader in = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = in.readLine()) != null) {
	            long input = Long.valueOf(line);
	            System.out.println(getSumOfDigits(input));
	        }
	    } catch (IOException e) {
	        System.out.println("File Read Error: " + e.getMessage());
	    }               
	}
}
