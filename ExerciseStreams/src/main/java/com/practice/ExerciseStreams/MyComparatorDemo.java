package com.practice.ExerciseStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparatorDemo {

	public static void main(String args[]) {

		List<Employee> list =  EmployeeDAO.getEmployees();
		System.out.println("Unsorted List");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		Collections.sort(list, new SortById());
		System.out.println("\nSorted by ID");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		Collections.sort(list, new SortByName());
		System.out.println("\nSorted by Name");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		Collections.sort(list, new SortBySalary());
		System.out.println("\nSorted by Salary");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}

	class MyComparator implements Comparator<Employee> {

		public int compare(Employee emp1, Employee emp2) {
	
			return (int) (emp1.getSalary() - emp2.getSalary());
		}
	}
	
	class SortById implements Comparator<Employee> {
	  // Used for sorting in ascending order of id
	  public int compare(Employee a, Employee b)
	  {
	    return a.getEmpId() - b.getEmpId();
	  }
	}
	class SortByName implements Comparator<Employee> {
	  // Used for sorting in ascending order of name
	  public int compare(Employee a, Employee b)
	  {
	    return a.getEmpName().compareTo(b.getEmpName());
	  }
	}
	class SortBySalary implements Comparator<Employee> {
	  //Used for sorting in ascending order of roll salary
	  public int compare(Employee a, Employee b)
	  {
	    return (int) (a.getSalary() - b.getSalary());
	  }
	}
