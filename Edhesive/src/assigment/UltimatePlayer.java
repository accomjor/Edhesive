package assigment;

public class UltimatePlayer extends Person {

	private static int jerseyNumber = 0;
	private String position = "";
	
	public UltimatePlayer(String f, String l, String p) {
		super(f, l);
		jerseyNumber++;
		if(p.equals("handler") || p.equals("cutter"))
			position = p;
		else
			position = "handler";
	}
	
	public String getPosition(){
		return position;
	}
	
	public String toString(){
		return
			super.toString()
		+   "\n   Jersey #: "
		+   jerseyNumber
		+   "\n   Position: "
		+   position
		;
	}

}
