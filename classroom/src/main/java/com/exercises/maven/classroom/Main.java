package com.exercises.maven.classroom;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
			
		Student st1 = new Student(23, "Kalle", "Anka", 'M', 7, 6, 6);
		students.add(st1);
		Student st2 = new Student(23, "Mimmi", "Pigg", 'F', 7, 8, 6);
		students.add(st2);
		Student st3 = new Student(23, "Kajsa", "Anka", 'F', 7, 4, 6);
		students.add(st3);
		Student st4 = new Student(23, "Janne", "Långben", 'M', 5, 6, 6);
		students.add(st4);
		
		
		Classroom classroom = new Classroom("C304a", "Autumn 2017", students);
		
		classroom.addANewStudent(st4);
		
		System.out.println(classroom.printFullRelatory());
		
	}
	

}
