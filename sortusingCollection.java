package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortusingCollection {

	public static void main(String[] args) {
		
		String[] input = {"HCL", "Wipro", "Aspire system","CTS"};
		List<String> values = new ArrayList<String>();
		for (String eachinput : input) {
			values.add(eachinput);}
		
		Collections.sort(values);
		for (String eachval : values) {
			System.out.println(eachval);
		}
			
		}

	}

