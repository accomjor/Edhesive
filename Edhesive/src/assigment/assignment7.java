package assigment;

import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.lang.Exception;
import java.lang.Character;
import java.lang.StringIndexOutOfBoundsException;
import java.lang.IndexOutOfBoundsException;

public class assignment7 {
    
    
    /*
    
    Edhesive class normal template for all purposes.
    version 1.3
    
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
        String input;
        Scanner scan = new Scanner(System.in);
        say("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
        input = scan.nextLine();
        input = duplicate(input);
        say("The duplicated String is: " + input);
        say("Next, please enter a String to check for Edhesive Palindromes.");
        input = scan.nextLine();
        if(isEdhesivePalindrome(input)){
            say("Nice, you found an Edhesive Palindrome!");
        } else {
            say("Too bad, that isn't an Edhesive Palindrome.");
        }
        say("Almost done! Please enter a number to scramble.");
        d = scan.nextDouble();
        d = numberScramble(d);
        say("The scrambled number is: " + d);
        
    }
    
    
    /***************************************************************************************************************/
    
    public static boolean isEdhesivePalindrome(String str){
        String s = "";
        String before = "";
        String after = "";
        int length = str.length();
        int bc = 0;
        int ac = 0;
        int charVal = 0;
        str = str.replace("0", "o");
        str = str.replace("3", "e");
        str = str.replace("4", "a");
        str = str.toLowerCase();
        if(length > 3 && length < 15){
            if(length % 2 == 0){
                for(i = 0; i < length/2; i++){
                    charVal = ((int) str.charAt(i));
                    bc += charVal;
                    // debug
                    //say(str.charAt(i) + " b " + ((int) str.charAt(i)) + " " + bc);
                }
                for(i = length/2; i < length; i++){
                    ac += (int) str.charAt(i);
                    // debug
                    //say(str.charAt(i) + " a " + ((int) str.charAt(i)) + " " + ac);
                }
                // debug 
                //say("bc: " + bc);
                //say("ac: " + ac);
            } else {
                for(i = 0; i < length/2; i++){
                    charVal = ((int) str.charAt(i));
                    bc += charVal;
                    // debug
                    //say(str.charAt(i) + " b " + ((int) str.charAt(i)) + " " + bc);
                }
                for(i = length/2 + 1; i < length; i++){
                    ac += (int) str.charAt(i);
                    // debug
                    //say(str.charAt(i) + " a " + ((int) str.charAt(i)) + " " + ac);
                }
                // debug 
                //say("bc: " + bc);
                //say("ac: " + ac);
            }
            if(bc == ac){
                return true;
            }
            return false;
        }
        return false;
    }
    
    
    public static String duplicate(String str){
        String s = "";
        boolean flag = false;
        int x = 0;
        int length = str.length();
        
        // check if length is even
        if(length % 2 == 0){ flag = true; }
        
        // if even else odd
        if(flag){
            for(i = 0; i < length; i++){
                for(x = 0; x < length*2; x++){
                    s = s + str.charAt(i);
                }
            }
        } else {
            for(i = 0; i < length; i++){
                for(x = 0; x < length; x++){
                    s = s + str.charAt(i);
                }
            }
        }
        
        return s;
    }
    
    public static double numberScramble(double num){
    	if(num < 0){
    		return 0.0;
    	} else {
    		num += 5;
    		num /= 2;
    		num = Math.pow(num, 0.5);
    		return num;
    	}
    }
    
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
