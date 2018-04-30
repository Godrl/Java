package PTest;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{

	private int[] testScores;
	private int totalScore;
	private int AvgScore;
	private String grade=" ";
	
	Student(String firstName, String lastName, int identification, int[]testScores){
		super(firstName, lastName, identification);
		this.testScores=testScores;		
	}
	String calculate() {		
		for(int i = 0; i < this.testScores.length; i++) {
			totalScore+=testScores[i];
			AvgScore=totalScore/testScores.length;
		}
		if(AvgScore < 40 ) {
			grade="T";
		}
		else if(AvgScore >= 40 && AvgScore < 55) {
			grade="D";
		}
		else if(AvgScore >= 55 && AvgScore < 70) {
			grade="P";
		}
		else if(AvgScore >= 70 && AvgScore < 80) {
			grade="A";
		}
		else if(AvgScore >= 80 && AvgScore < 90) {
			grade="E";
		}
		else if(AvgScore >= 90 && AvgScore <= 100) {
			grade="O";
		}
		return grade;
	}
	/*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}

class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}