package coding_activity;

import java.util.Scanner;

public class Lesson_15_Activity {
    
    
    /*
    
    Edhesive class normal template for all purposes.
    version 2.0
    
    */
    
    
    /***************************************************************************************************************/
    
    
    public static String s;
    public static Character ch;
    public static Integer in;
    public static Long lo;
    public static Double db;
    public static Boolean bo;
    public static char c;
    public static int i;
    public static long l;
    public static double d;
    public static boolean b;
    public static void main(String args[]){
        
        // Code goes here..
        String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
        sortAndPrint(list);
    	
    }
    
    public static void sortAndPrint(String[] list){
    	String temp = "";
    	for(int i = 0; i < list.length; i++){
    		for(int c = i; c < list.length; c++){
    			if(list[i].compareTo(list[c]) > 0){
    				temp = list[i];
    				list[i] = list[c];
    				list[c] = temp;
    			}
    		}
    	}
    	for(String str : list)
    		raw(str + " ");
    }
    
    /***************************************************************************************************************/
    
	// print an OBJECT to the console on a new line.
    // Updated: Version 2.0
    public static void say(Object o){
        System.out.println(o);
        return;
    }
    
    // print a raw OBJECT to the console.
    // Updated: Version 2.0
    public static void raw(Object o){
        System.out.print(o);
        return;
    }
}
