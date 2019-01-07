package assignment;

/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */

public class Dashboard implements Comparable {

    private int odometer;
    private int speedometer;
    private static int raceNum = 0;
    private boolean checkEngine;

    public Dashboard() {
        odometer = 0;
        speedometer = 0;
        checkEngine = false;
    }

    public Dashboard(int milesTravelled, int speed) {
    	checkEngine = false;
    	if(milesTravelled >= 0 && milesTravelled <= 99999) odometer = milesTravelled;
    	else {
    		odometer = 0;
    		checkEngine = true;
    	}
    	
    	if(speed >= 0 && speed <= 100) speedometer = speed;
    	else {
    		speedometer = 0;
    		checkEngine = true;
    	}
    	
    }

    public String toString() {
    	int speed = speedometer;
    	String miles = odometer + "";
    	
    	if(odometer < 10) miles = "0" + miles;
    	if(odometer < 100) miles = "0" + miles;
    	if(odometer < 1000) miles = "0" + miles;
    	if(odometer < 10000) miles = "0" + miles;
    	
        String stats = "\n\nSpeedometer: " 
        			+ speed
        			+ " MPH\n"
        			+ "Odometer: "
        			+ miles
        			+ "\nCheck Engine: "
        			+ (checkEngine ? "On" : "Off");
        return stats;
    }

    public void accelerate() {
        if(speedometer < 100) speedometer++;
        else { speedometer = 0; checkEngine = true; }
    }

    public void drive(int numMinutes) {
    	
    	int distance = 0;
    	if(numMinutes < 720){
	        distance = (numMinutes * (speedometer / 60));
	    	if(odometer + distance > 99999) {
	    		odometer = 0;
	    		checkEngine = true;
	    		
	    	} else {
		        odometer += distance;
	    	}
    	}
        
    }

	public int compareTo(Object d) {
		Dashboard temp = (Dashboard) d;
		if(odometer != temp.odometer){
			return (odometer > temp.odometer ? 1 : -1);
		} else if(speedometer != temp.speedometer){
			return (speedometer > temp.speedometer ? 1 : -1);
		} else if(checkEngine != temp.checkEngine){
			return (checkEngine && !temp.checkEngine ? 1 : -1);
		}
		return 0;
	}

	public String race(Dashboard d, int acc1, int acc2){
		raceNum++;
		while(!checkEngine && !d.checkEngine){
			for(int i = 0; i < acc1; i++){
				accelerate();
			}
			for(int i = 0; i < acc2; i++){
				d.accelerate();
			}
		}
		return 
			"\nRace " 
			+ raceNum 
			+ ": "
			+ ( checkEngine &&  d.checkEngine ? "Both cars stall" : 
			  ( checkEngine && !d.checkEngine ? "Car 1 stalls"    :
			  (!checkEngine &&  d.checkEngine ? "Car 2 stalls"    :
			  ( speedometer ==  d.speedometer ? "Neither car stalls, both have the same speed" :
				"Neither car stalls"))))
			+ (  checkEngine ? "\nFirst car stalled out!"   : "")
			+ (d.checkEngine ? "\nSecond car stalled out!" : "")
			+ toString()
			+ d.toString()
			+ "\n\n"
			+ ( checkEngine &&  d.checkEngine ? "It's a tie!" :
			  ( speedometer ==  d.speedometer ? "It's a tie!" :
			  ((checkEngine && !d.checkEngine) || (speedometer < d.speedometer) ? "Car 2 has won the race!" :
				 "Car 1 has won the race!")))
		;
	}
	
	public String difference(Dashboard d){
		return "";
	}
}