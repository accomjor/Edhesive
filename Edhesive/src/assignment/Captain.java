package assignment;

public class Captain extends UltimatePlayer {

	private boolean type;
	
	public Captain(String f, String l, String p, boolean t) {
		super(f, l, p);
		type = t;
	}
	
	public String toString(){
		return
				super.toString()
			+	"\n   Captain: "
			+	(type ? "offense" : "defense")
		;
	}

}
