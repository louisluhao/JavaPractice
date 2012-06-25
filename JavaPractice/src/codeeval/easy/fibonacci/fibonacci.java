package codeeval.easy.fibonacci;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fibonacci {
	
	private static long generateNext(long a, long b){
		return a + b;
	}
	
	static long getNthFibonacciNumber(long n){
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else{
			int num = 1;
			long a = 0, b = 1;
			while(num < n){
				long temp = generateNext(a, b);
				a = b; b = temp;
				num++;
			}
			return b;
		}
	}
	
	public static void main (String[] args) {
	    try {
	        File file = new File(args[0]);
	        BufferedReader in = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = in.readLine()) != null) {
	            System.out.println(getNthFibonacciNumber(Long.valueOf(line)));
	        }
	    } catch (IOException e) {
	        System.out.println("File Read Error: " + e.getMessage());
	    }               
	}
}
