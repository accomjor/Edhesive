package main;

import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.lang.Exception;
import java.lang.Character;
import java.lang.StringIndexOutOfBoundsException;
import java.lang.IndexOutOfBoundsException;

public class NewClass {
    
    
    /*
    
    Edhesive class normal template for all purposes.
    version 1.4
    
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

    }
    
    public static int randomize(int a, int b){
    	int random = 0;
    	return random;
    }
    
    public static int randomize(int a){
    	int random = 0;
    	return random;
    }
    
    public static int randomize(double a, double b){
    	int random = 0;
    	return random;
    }
    
    public static int randomize(double a){
    	int random = 0;
    	return random;
    }
    
    
    /***************************************************************************************************************/
    
    
    // print a message to the console on a new line.
    // Updated: Version 1.0
    public static void say(String string){
        System.out.println(string);
        return;
    }
    
    // print a raw message to the console.
    // Updated: Version 1.1
    public static void raw(String string){
        System.out.print(string);
        return;
    }
    
    // print a message to the console removing any
    // proceeding and preceding spaces.
    // Updated: Version 1.0
    public static void sayStripped(String s){
        int i, count, bC, aC;
        boolean f = false;
        count = 0;
        // After Word Space Count
        aC = 0;
        // Before Word Space Count
        bC = 0;
        // Remove spaces before word
        for(i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                bC++;
            } else {
                break;
            }
        }
        s = s.substring(0 + bC, s.length());
        
        // Remove spaces after word
        for(i = s.length() - 1; i > 0; i--){
            if(s.charAt(i) == ' '){
                aC++;
            } else {
                break;
            }
        }
        s = s.substring(0, s.length() - aC);
        say(s);
        return;
    }
    
}
