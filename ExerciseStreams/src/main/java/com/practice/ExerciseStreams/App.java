package com.practice.ExerciseStreams;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

/**
 * Interview questions
 *
 */
public class App 
{
	
	public static void main(String [] args){
	List<Employee> employees = EmployeeDAO.getEmployees();
	
	
    // Convert elements to strings and concatenate them, separated by commas
     	employees.stream()
                      .map(Object::toString)
                      .collect(Collectors.joining(", "));
     
   // Group employees by department
        employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()))
                    .entrySet()
                    .forEach(System.out :: println);
        
  // Compute sum of salaries by department
        employees.stream()
                       .collect(Collectors.groupingBy(Employee::getDept,
                                                      Collectors.summingLong(Employee::getSalary)))
                       .entrySet()
                       .forEach(System.out :: println);

			
	}
}

