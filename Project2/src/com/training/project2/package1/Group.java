package com.training.project2.package1;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Student> students;
	
	public Group() {
		students = new ArrayList<Student>(10);
	}
	
	public Group(List<Student> students) {
		this.students = students;
	}
	
	public Student getStudent(int i) {
		return students.get(i);
	}
	
	public int getSizeOfGroup() {
		return students.size();
	}
	
	public boolean add(Student a) {
	    if (students.size() >= 10) {
	    	return false;
	    }
	    return students.add(a);
	}
	
	public List<Student> findByMark(int mark1, int mark2) {
			List<Student> result = new ArrayList<>();
			
			for(Student st: students) {
				int[] grade = st.getGrade();
				if (matchByMarks (grade, new int[] {mark1, mark2})) {
					result.add(st);
				}
			}
		return result;
		
	}
	
	private boolean matchByMarks(int[] grade, int[] marks) {
		int minGoodScore = minScore(marks);
		
		return isGradeHigherOrEqualThan(grade, minGoodScore);
		
		
	}
	
	private int minScore(int[] marks) {
		int min = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < min) {
				min = marks[i];
			}
		}
		return min;
	}
	
	private boolean isGradeHigherOrEqualThan(int[] grade, int mark) {
		for (int i = 0; i < grade.length; i++) {
			if (grade[i] < mark) {
				return false;
			}
		}
		return true;
	}

}
