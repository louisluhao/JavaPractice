package contest.google.jam2012.problem.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Google code jam 2012 practice problem a
 * @author louis
 */
public class Main {
	
	public static void main(String[] args) {
		initMapping();
		try {
			readAndRun();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Map<String,String> mapping = new HashMap<String, String>();
	
	private static String[] splitBySpace(String string){
		return string.split(" ");
	}
	
	private static void mappingChar(String k, String v){
		if(k.equals(" ") && v.equals(" "))
			return;
		if(k.equals(" ") || v.equals(" "))
			throw new IllegalArgumentException("mapping shouldn't just from alphabet to alphabet");
		mapping.put(k, v);
	}
	
	private static void mappingLine(String line, String ans){
		if(line.length() != ans.length())
			throw new IllegalArgumentException("the two line should have equal length");
		for(int i = 0; i < line.length(); i++){
			mappingChar(String.valueOf(line.charAt(i)),String.valueOf(ans.charAt(i)));
		}
		mappingChar("q", "z");
		mappingChar("z", "q");
	}
	
	private static void initMapping(){
		mappingLine("ejp mysljylc kd kxveddknmc re jsicpdrysi", "our language is impossible to understand");
		mappingLine("rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "there are twenty six factorial possibilities");
		mappingLine("de kr kd eoya kw aej tysr re ujdr lkgc jv", "so it is okay if you want to just give up");
	}
	
	private static String translateChar(String input){
		if(input.equals(" "))
			return " ";
		return mapping.get(input);
	}
	
	private static List<String> translation(String input){
		List<String> returnStrings = new ArrayList<String>();
		for(int i = 0; i < input.length(); i++){
			returnStrings.add(translateChar(String.valueOf(input.charAt(i))));
		}
		return returnStrings;
	}
	
	private static void printlnList(List<String> strings){
		for(String string: strings){
			System.out.print(string);
		}
		System.out.println();
	}
	


	private static void readAndRun() throws FileNotFoundException {
		File file = new File("C:\\Users\\lolu\\Documents\\A-small-practice.in");
		Scanner scanner = new Scanner(file);
		scanner.nextLine();
		int caseNum = 0;
		while(scanner.hasNextLine()){
			caseNum++;
			System.out.print("Case #"+caseNum+": ");
			printlnList(translation(scanner.nextLine()));
		}
	}

}
