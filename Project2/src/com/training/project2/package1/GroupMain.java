package com.training.project2.package1;

import java.util.List;

public class GroupMain {

	public static void main(String[] args) {
		Group students = new Group();
		
		students.add(new Student("Иванов","Василий",25,new int[] {6,8,9,10,5}));
		
		students.add(new Student("Петров","Дмитрий",25,new int[] {5,4,3,3,4}));
		
		students.add(new Student("Сидорова","Дарья",24, new int[] {10,9,10,10,9}));
		
		students.add(new Student("Козлов","Михаил",24, new int[] {9,9,9,9,10}));
		
		students.add(new Student("Успенская","Виктория",24, new int[] {6,7,8,6,6}));
		
		students.add(new Student("Морозова","Юлия",25, new int[] {10,10,10,10,10}));
		
		students.add(new Student("Беляев","Александр",25, new int[] {9,9,9,10,10}));
		
		students.add(new Student("Жуков","Павел",24, new int[] {6,7,7,6,3}));
		
		students.add(new Student("Щукина","Оксана",25, new int[] {8,9,7,8,9}));
		
		students.add(new Student("Жижина","Екатерина",24, new int[] {10,9,9,9,10}));
		
		System.out.println("----------------------Студенты------------------------");
		print(students);
		System.out.println("-----------------------------------------------------");
		
		List<Student> honorsStudents = students.findByMark(9, 10);
		Group goodScore = new Group(honorsStudents);
		
		System.out.println("----------------------Отличники----------------------");
		print(goodScore);
		System.out.println("-----------------------------------------------------");

	}
	
	public static void print(Group students) {
		for (int i = 0; i < students.getSizeOfGroup(); i++) {
			Student b = students.getStudent(i);
			if (b != null) {
				System.out.println("Фамилия - " + b.getSurname() + " Номер группы - " + b.getNumberOfGroup());
				}
		}
		
	}

}
