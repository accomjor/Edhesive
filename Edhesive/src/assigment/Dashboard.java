package assigment;

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
        /* missing code */
        return "";
    }

    public void accelerate() {
        if(speedometer < 100) speedometer++;
        else { speedometer = 0; checkEngine = true; }
    }

    public void drive(int numMinutes) {
    	int distance;
        distance = (numMinutes * (speedometer / 60));
        
    }

}