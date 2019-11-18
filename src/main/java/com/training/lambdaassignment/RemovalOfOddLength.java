package com.training.lambdaassignment;

import java.util.ArrayList;

public class RemovalOfOddLength {
	
	/** apply removeIf() method 
    *  we are going to remove names 
    * which are odd in length
    */
	public static ArrayList<String> OddLengthremove(ArrayList<String> mofifyList) {
		mofifyList.removeIf(n -> n.length() % 2 != 0);
		return mofifyList;
	};


}
