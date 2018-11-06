package coding_activity;

public class Vehicle {

	private int location;
	
	public Vehicle(){
		location = 0;
	}
	
	public Vehicle(int loc){
		if(loc <= 20 && loc >= -20)
			location = loc;
		else if(loc > 20)
			location = 20;
		else
			location = -20;
	}
	
	public void forward(){
		if(location < 20)
			location++;
	}
	
	public void backward(){
		if(location > -20)
			location--;
	}
}
