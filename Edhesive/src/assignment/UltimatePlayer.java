package assignment;

public class UltimatePlayer extends Person {

	private static int jerseyNumber;
	private int num;
	private String position = "";
	
	public UltimatePlayer(String f, String l, String p) {
		super(f, l);
		if(p.equals("handler") || p.equals("cutter"))
			position = p;
		else
			position = "handler";
		jerseyNumber++;
		num = jerseyNumber;
	}
	
	public String getPosition(){
		return position;
	}
	
	public String toString(){
		return
			super.toString()
		+   "\n   Jersey #: "
		+   num
		+   "\n   Position: "
		+   position
		;
	}

}
