package assignment;

import java.util.ArrayList;

public class UltimateTeam {
	
	ArrayList<UltimatePlayer> players;
	ArrayList<Coach> coaches;
	
	public UltimateTeam (ArrayList<UltimatePlayer> p, ArrayList<Coach> c) {
		players = p;
		coaches = c;
	}
	
	public String getCutters () {
		String cutters = "";
		for(UltimatePlayer player : players){
			cutters += (player.getPosition().equals("cutter") ? player.toString() + "\n" : "");
		}
		return cutters;
	}
	
	public String getHandlers () {
		String handlers = "";
		for(UltimatePlayer player : players){
			handlers += (player.getPosition().equals("handler") ? player.toString() + "\n" : "");
		}
		return handlers;
	}
	
	public String toString () {
		String c = "", pl = "";
		for(Coach coach : coaches){ c += (coach.toString() + "\n"); }
		for(UltimatePlayer player : players){ pl += (player.toString() + "\n"); }
		return
			"COACHES\n"
		+   c
		+	"\n"
		+	"PLAYERS\n"
		+	pl
		;
	}
	
}
