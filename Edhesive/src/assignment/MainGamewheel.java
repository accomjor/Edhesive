package assignment;

import java.util.*;

public class MainGamewheel {

	public static void main(String[] args){
		GameWheel g = new GameWheel();
		PrizeCard p = new PrizeCard();
		int p1 = 0;
		int p2 = 0;
		ArrayList<PrizeCard> prizes1 = new ArrayList<PrizeCard>();
		ArrayList<PrizeCard> prizes2 = new ArrayList<PrizeCard>();
		for(int i = 0; i < 5; i++){
			p = g.spinWheel();
			if(!prizes1.contains(p)){
				prizes1.add(p);
				p1 += p.getPrizeAmount();
			} else {
				i--;
			}
		}
		for(int i = 0; i < 5; i++){
			p = g.spinWheel();
			if(!prizes2.contains(p)){
				prizes2.add(p);
				p2 += p.getPrizeAmount();
			} else {
				i--;
			}
		}
		System.out.println("Player 1 Total: $" + p1);
		for(PrizeCard wp1 : prizes1){
			System.out.println(wp1.toString());
		}
		System.out.println("\nPlayer 2 Total: $" + p2);
		for(PrizeCard wp2 : prizes2){
			System.out.println(wp2.toString());
		}
		
		System.out.println("\n" + (p1 > p2 ? ("Player 1 won by $" + (p1-p2) + "!") : ("Player 2 won by $" + (p2-p1) + "!")));
	}
	
}