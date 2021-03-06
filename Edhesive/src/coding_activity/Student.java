package coding_activity;

public class Student {
	
	private String fname, lname;
	private int grade;
	private double GPA;
	private static int id = 0;
	
	public Student(){
		this("None", "None", 0, 0.0);
	}
	
	public Student(String firstName, String lastName, int gradeLevel, double gpa){
		fname = firstName;
		lname = lastName;
		if(gradeLevel >= 0 && gradeLevel <= 12){
			grade = gradeLevel;
		} else {
			grade = 0;
		}
		if(gpa >= 0 && gpa <= 4.5) {
			GPA = gpa;
		} else {
			GPA = 0.0;
		}
		id++;
	}
	
	public String toString(){
		return lname 
			+ ", " 
			+ fname
			+ "\nGPA: "
			+ GPA
			+ "\nGrade Level: "
			+ grade
			+ " id # "
			+ id;
	}
	
}
