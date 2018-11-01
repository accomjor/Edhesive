package coding_activity;

import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.lang.Exception;
import java.lang.Character;
import java.lang.StringIndexOutOfBoundsException;
import java.lang.IndexOutOfBoundsException;

public class Lesson_35_Activity {
    
    
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
    	mystery(9);
    	
    }
    
    public static int randomize(int a, int b){
    	int max = Math.max(a, b);
    	int min = Math.min(a, b);
    	int random = ((int) (Math.random() * (max - min)) + min);
    	return random;
    }
    
    public static int randomize(int a){
    	int max =  Math.max(a, 0);
    	int min =  Math.min(a, 0);
    	int random = ((int) (Math.random() * (max - min)) + min);
    	return random;
    }
    
    public static double randomize(double a, double b){
    	double max = Math.max(a, b);
    	double min = Math.min(a, b);
    	double random = ((Math.random() * (max - min)) + min);
    	return random;
    }
    
    public static double randomize(double a){
    	double max = Math.max(a, 0);
    	double min = Math.min(a, 0);
    	double random = ((Math.random() * (max - min)) + min);
    	return random;
    }
    
    
    /***************************************************************************************************************/
    
    public static void mystery(int n) {
        if (n > 0) {
            n--;
            mystery(n);
        }
        System.out.print(n + " ");
    }
    
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
