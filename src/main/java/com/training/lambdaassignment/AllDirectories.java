package com.training.lambdaassignment;

import java.io.File;
	import java.util.Arrays;
	import java.util.Comparator;

	/**
	 * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class,
	 * write a method that returns all subdirectories of a given directory.
	 * Use a lambda expression instead of a FileFilter object.
	 * Repeat with a method expression
	 */
	public class AllDirectories {
		
       
        File file =new File(".txt");

	    public static void allDirectories(File file) {
	       /* File[] listOfFiles = file.listFiles(pathname -> true);
	        if (listOfFiles != null) {
	            for (File listOfFile : listOfFiles) {
	                if (listOfFile.isDirectory()) {
	                    allDirectories(listOfFile);
	                     System.out.println("Directory: %s%n"+listOfFile.getAbsolutePath());
	                }
	            }
	        }
			//return null;*/
	    	
	    	File[] listOfFiles = file.listFiles((d,s) -> {
	    		return s.toLowerCase().endsWith(".txt");
	    	});
	    	
	    	for (File file1 : listOfFiles) {
				System.out.println(file1);
			}
	    }
	    
	    
	  

	    public static void allFiles(File file) {
	        File[] listOfFiles = file.listFiles(pathname -> true);
	        for (File listOfFile : listOfFiles) {
	            if (listOfFile.isFile()) {
	                System.out.printf("File: %s%n", listOfFile.getName());
	            } else {
	                allFiles(listOfFile);
	            }
	        }
	    }

	 

	    public static void main(String[] args) {
           allDirectories(new File("C:\\Users\\pripawar\\Downloads"));
	        System.out.println("========================");
	       allFiles(new File("C:\\Users\\pripawar\\Downloads"));
	        System.out.println("========================");
	     
	    }
}




