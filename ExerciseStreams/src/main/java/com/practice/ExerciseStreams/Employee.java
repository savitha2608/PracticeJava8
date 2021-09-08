package com.practice.ExerciseStreams;

import java.util.Comparator;

public class Employee {
	
	private String empName;
	
	private int empId;
	
	private String dept;
	
	private long salary;
	
	private int age;

	public Employee(int id, String name, String deptName, int sal, int empAge) {
		empName = name;
		empId = id;
		dept = deptName;
		salary = sal;
		age = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", dept=" + dept + ", salary=" + salary + ", age= "+ age + " ]" + "\n";
	}
	


}
