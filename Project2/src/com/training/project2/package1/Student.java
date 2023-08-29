package com.training.project2.package1;

import java.util.Arrays;
import java.util.Objects;

public class Student {
	
	private String surname;
	private String name;
	private int numberOfGroup;
	private int[] grade;
	private int countOfMarks = 0;
	
	public Student() {}
	
	public Student(String surname, String name, int numberOfGroup, int[] grade) {
			this.surname = surname;
			this.name = name;
			this.numberOfGroup = numberOfGroup;
		    this.grade = grade;
		    countOfMarks = grade.length;
		
	}
	
	public boolean addMark(int mark) {
		if (countOfMarks >= grade.length) {
			int[] temp = new int[grade.length + 10];
			
			for (int i = 0; i < grade.length; i++) {
				temp[i] = grade[i];
			}
			grade = temp;
		}
		grade[countOfMarks++] = mark;
		return true;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumberOfGroup(int numberOfGroup) {
		this.numberOfGroup = numberOfGroup;
	}
	
	public void setGrade(int[] grade) {
		this.grade = grade;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfGroup() {
		return numberOfGroup;
	}
	
	public int[] getGrade() {
		return grade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grade);
		result = prime * result + Objects.hash(countOfMarks, name, numberOfGroup, surname);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return countOfMarks == other.countOfMarks && Arrays.equals(grade, other.grade)
				&& Objects.equals(name, other.name) && numberOfGroup == other.numberOfGroup
				&& Objects.equals(surname, other.surname);
	}

}
