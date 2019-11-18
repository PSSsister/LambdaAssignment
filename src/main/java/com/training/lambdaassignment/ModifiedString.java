package com.training.lambdaassignment;

import java.util.ArrayList;

public class ModifiedString {
	
	public static StringBuilder modifystringFilter(ArrayList<String> strings) {
		StringBuilder sb = new StringBuilder();
		strings.forEach(string -> sb.append(string.charAt(0)));
		return sb;
	}


}
