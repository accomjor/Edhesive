package coding_activity;

import java.io.*;
import java.lang.*;
import java.util.*;
import docs.Jordan;

public class ClassWork {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		boolean same = false;
		double d = 0.0;
		int i = 0;
		say("Enter a double then an int......");
		d += scan.nextDouble();
		i += scan.nextInt();
		if(d == i){
			say("input int and input double are the same");
			same = true;
		}else if((int) d == i){
			say("input int and input double are very close to each other");
		}else{
			say("input int and input double are not the same");
		}
		say("Same? " + same);
		say("\nPick a number between 1 and 10");
		int num = scan.nextInt();
		switch(num){
			case 1: say("Let me guess, you typed the number 1? ;o"); break;
			case 2: say("Let me guess, you typed the number 2? ;o"); break;
			case 3: say("Let me guess, you typed the number 3? ;o"); break;
			case 4: say("Let me guess, you typed the number 4? ;o"); break;
			case 5: say("Let me guess, you typed the number 5? ;o"); break;
			case 6: say("Let me guess, you typed the number 6? ;o"); break;
			case 7: say("Let me guess, you typed the number 7? ;o"); break;
			case 8: say("Let me guess, you typed the number 8? ;o"); break;
			case 9: say("Let me guess, you typed the number 9? ;o"); break;
			case 10: say("Let me guess, you typed the number 10? ;o");
		}
		say("\nEnter my favorite number or you will be stuck here forever :)\nHint: between 0 and 10 =}");
		int guess = 0;
		int tries = 1;
		int randNum = ((int) (Math.random() * 10));
		while(true){
			guess = scan.nextInt();
			if(randNum == guess){
				say("Waw that is my favorite number ;ooo");
				say("IT TOOK YOU " + tries  + " guesses....?!?!? so sad");
				break;
			}
			tries++;
			say("Incorrect ahahaAHAHA");
		}
		String you = "you";
		String are = "are";
		String fail = "fail";
		say("\n\n\n");
		say(you + " " + fail);
		say(fail + " " + you);
		say(fail + " " + you + " " + fail);
		say(you + " " + are + " " + fail);
		say("I just did concetenation did you enjoy that?");
		say("\n\n\n");
		say("Here are your grades :)");
		String[] grades = new String[5];
		String[] actualGrades = new String[7];
		grades[0] = "F+";
		grades[1] = "F";
		grades[2] = "F";
		grades[3] = "F+";
		grades[4] = "F";
		actualGrades[5] = "F-";
		actualGrades[6] = "F-";
		for(int x = 0; x < grades.length; x++){
			say(grades[x]);
		}
		say("=}");
		say("Oh wait forgot two classes..");
		say("This should help your GPA! oh wait-");
		System.arraycopy(grades, 0, actualGrades, 0, grades.length);
		for(String s : actualGrades){
			say(s);
		}
		
	}
	public static void say(Object o){
		Jordan.say(o);
	}
}

