package week3.day2.classroom;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {

	public static void main(String[] args) {
		
		char[] input = {'p','a','y','p','a','l','I','n','d','i','a'};
		Set<Character> values = new LinkedHashSet<Character>();

		for (Character eachchar : input) {
			
			values.add(eachchar);
			
		}
		System.out.println(values);
	}

}
