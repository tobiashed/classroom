package com.exercises.maven.classroom;

import java.text.DecimalFormat;

public class Student extends Person {
	private double firstGrade = 0;
	private double secondGrade = 0;
	private double thirdGrade = 0;
	private double averageGrade = 0;
	

	public Student(int age, String firstName, String lastName, char gender) {
		super(age, firstName, lastName, gender);
		// TODO Auto-generated constructor stub
	}


	public Student(int age, String firstName, String lastName, char gender, double firstGrade, double secondGrade,
			double thirdGrade) {
		super(age, firstName, lastName, gender);
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;
	}


	public double calculateAverage() {
		double result = 0;
		result = (firstGrade + secondGrade + thirdGrade) / 3; 
		setAverageGrade(result);
		return averageGrade;
	}
	public double calculateAverage(double firstGrade, double secondGrade, double thirdGrade) {
		double result = 0;
		result = (firstGrade + secondGrade + thirdGrade) / 3; 
		setAverageGrade(result);
		return averageGrade;
	}
	public boolean hasClearedTheCourse() {
		boolean result = true;
		
		if (getAverageGrade() < 6.0) {
			 result = false;
			 return result;
		}
		return result;
	}

	public double getFirstGrade() {
		return firstGrade;
	}


	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}


	public double getSecondGrade() {
		return secondGrade;
	}


	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}


	public double getThirdGrade() {
		return thirdGrade;
	}


	public void setThirdGrade(double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}


	public double getAverageGrade() {
		return averageGrade;
	}


	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}


	public String toString() {
		calculateAverage(this.firstGrade, this.secondGrade, this.thirdGrade);
		DecimalFormat df = new DecimalFormat("#.0");
		if (hasClearedTheCourse()) {
			return "Student: " + getFirstName() + " " + getLastName() +
					"\nGrades: " + getFirstGrade() + ", " + getSecondGrade() + ", " + getThirdGrade() + 
					"\nFinal grade: " + df.format(getAverageGrade()) + 
					"\nThe student has cleared the course!" + 
					"\n-----------------------------------";
		} else {
			return "Student: " + getFirstName() + " " + getLastName() +
					"\nGrades: " + getFirstGrade() + ", " + getSecondGrade() + ", " + getThirdGrade() + 
					"\nFinal grade: " + df.format(getAverageGrade()) + 
					"\nThe student has not cleared the course!" + 
					"\n---------------------------------------";
		}
		
	}
	
	

}
