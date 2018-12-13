package assigment;

public class UltimatePlayer extends Person {

	private static int jerseyNumber = 0;
	private String position = "";
	
	public UltimatePlayer(String f, String l) {
		super(f, l);
		jerseyNumber++;
	}

}
