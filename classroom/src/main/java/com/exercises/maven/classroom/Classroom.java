package com.exercises.maven.classroom;

import java.util.ArrayList;

public class Classroom {
	private String classroomName = "";
	private String classroomTerm = "";
	private ArrayList<Student> students;
	
		
	public Classroom(String classroomName, String classroomTerm, ArrayList<Student> students) {
		this.classroomName = classroomName;
		this.classroomTerm = classroomTerm;
		this.students = students;
	}
	
	public void addANewStudent(Student student) {
		if (students.contains(student)) {
			System.out.println("Student: " + student.getFirstName() + " " + student.getLastName() + " already exists!\n");
		}else {
			students.add(student);
		}
		
		
	}
	public void removeAStudent(String firstName) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getFirstName().equals(firstName)) {
				students.remove(i);
				System.out.println("Student: " + firstName + " was successfully removed!");
			} else {
				System.out.println("This student does not exist!");
			}
		}

	}
	
	public String printFullRelatory() {
		String result = "";
		 // iterate through customerAccounts in order to print all positions in the arrayList
	      for(int i = 0; i < students.size(); i++){
	    	  result += students.get(i);
	          // adding a line break
	          result+= "\n";
	      }
		return "Classroom: " + getClassroomName() + ", term: " + getClassroomTerm() + "\n\n" + result;
	}
	
	
	public String getClassroomName() {
		return classroomName;
	}
	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}
	public String getClassroomTerm() {
		return classroomTerm;
	}
	public void setClassroomTerm(String classroomTerm) {
		this.classroomTerm = classroomTerm;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	
}
