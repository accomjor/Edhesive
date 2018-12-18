package assignment;

/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */

public class Dashboard {

    private int odometer;
    private int speedometer;
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

}