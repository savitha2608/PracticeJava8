package com.practice.ExerciseStreams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	public static List<Employee> getEmployees() {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee( 101, "Steven", "IT", 60000, 33));
		list.add(new Employee( 102, "Abbot", "ACCOUNTS", 30000, 32));
		list.add(new Employee( 103, "Camey", "HR", 40000, 30));
		list.add(new Employee( 104, "Emily", "MARKETING", 50000, 41));
		list.add(new Employee( 105, "Anthony", "IT", 80000, 42));
		list.add(new Employee( 106, "Erin", "IT", 70000, 44));
		
		return list;
	}
}
