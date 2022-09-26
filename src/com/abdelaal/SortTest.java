package com.abdelaal;
import java.util.*;
import java.util.stream.Collectors;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

public class SortTest {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		Comparator<Student> comp = 
				Comparator.comparing
				(Student::getCgpa).reversed()				
				.thenComparing(Student::getFname)
				
//				.thenComparing(Student::getCgpa)
//				.thenComparing(Student::getId)
				;
		
		studentList = studentList.stream().sorted(comp).collect(Collectors.toList());
      	for(Student st: studentList){
			System.out.println(st);
		}
	}
}
