package coding_activity;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.lang.String;
import java.lang.Exception;
import java.lang.Character;
import java.lang.StringIndexOutOfBoundsException;
import java.lang.IndexOutOfBoundsException;

public class Lesson_1_Activity {
    
    
    /*
    
    Edhesive class normal template for all purposes.
    version 1.5
    
    */
    
    
    /***************************************************************************************************************/
    
    public static String s;
    public static char c;
    public static int i;
    public static long l;
    public static double d;
    public static boolean bool;
    public static void main(String args[]){
        
        // Code goes here..
    	boolean stop = false;
    	i = 0;
    	Scanner scan = new Scanner(System.in);
    	ArrayList<String> list = new ArrayList<String>();
    	while(!stop){
	    	s = scan.nextLine();
	    	if(!s.equals("STOP")){
	    		list.add(s);
	    		i++;
	    	} else {
	    		stop = true;
	    	}
    	}
    	say(list.size() + "");
    	say(list + "");
    	if(list.size() > 2){
	    	list.remove(i - 1);
	    	list.remove(0);
    	}
    	say(list + "");
    	
    }
    
    /***************************************************************************************************************/
    
    
    // print a STRING to the console on a new line.
    // Updated: Version 1.0
    public static void say(String string){
        System.out.println(string);
        return;
    }
    
    
    // print an INT to the console on a new line.
    // Updated: Version 1.5
    public static void say(int i){
        System.out.println(i + "");
        return;
    }
    
    
    // print a DOUBLE to the console on a new line.
    // Updated: Version 1.5
    public static void say(double d){
        System.out.println(d + "");
        return;
    }
    
    // print a raw STRING to the console.
    // Updated: Version 1.1
    public static void raw(String string){
        System.out.print(string);
        return;
    }
    
    // print a raw INT to the console.
    // Updated: Version 1.5
    public static void raw(int i){
        System.out.print(i + "");
        return;
    }
    
    // print a raw DOUBLE to the console.
    // Updated: Version 1.5
    public static void raw(double d){
        System.out.print(d + "");
        return;
    }
    
    
}
