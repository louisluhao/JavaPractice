package codeeval.hard.stringpermutations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

public class str_perm {
 	private SortedSet<String> perm = new TreeSet<String>();
	
	public str_perm(String originalInput){
		allPermutations(originalInput, 0, originalInput.length() - 1);
	}
	
	public SortedSet<String> getResultPerm(){
		return perm;
	}
	
    private String switchString(String in, int from, int to){
		StringBuffer string = new StringBuffer(in);
		char temp = string.charAt(from);
		string.setCharAt(from, string.charAt(to));
		string.setCharAt(to, temp);
		return string.toString();
	}
	
    private void allPermutations(String in, int from, int to){
		if(from == to){
			perm.add(in);
		}else{
			for(int i = from; i <= to; i++){
				in = switchString(in, from, i);
				allPermutations(in, from + 1, to);
				in = switchString(in, from, i);
			}
		}
	}
	
	public static void main (String[] args) {
	    try {
	        File file = new File(args[0]);
	        BufferedReader in = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = in.readLine()) != null) {
	        	str_perm permCompute = new str_perm(line);
	        	SortedSet<String> ret = permCompute.getResultPerm();
	        	boolean isFirst = true;
	        	for(String string : ret){
	        		if(isFirst){
	        			System.out.print(string);
	        			isFirst = false;
	        		}else{
	        			System.out.print(","+string);
	        		}
	        	}
	        	System.out.println();
	        }
	    } catch (IOException e) {
	        System.out.println("File Read Error: " + e.getMessage());
	    }         
	}	
}
