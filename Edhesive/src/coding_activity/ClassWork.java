package coding_activity;

import java.io.*;
import java.lang.*;
import java.util.*;

import assignment.Jordan;

public class ClassWork {
	public static void main(String[] args){
		try {
			Runtime r = Runtime.getRuntime();
			Process p;
			for(int i = 0; i < 100; i++)
				p = r.exec("//bin//rmdir Caodan" + i);
//			BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
//			String l;
//			while((l = b.readLine()) != null)
//				Jordan.say(l);
			
		} catch (IOException e) {
			Jordan.say("Boi... there was an error");
		}
	}
}
