package com.practice.ExerciseStreams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample {

	public static void main(String[] args) {

		/*Thread thread =  new Thread(() -> printMessage());
		thread.start();*/
		
		// Method reference 
		// pass through - just executing a method, no argument and no output
		Thread thread =  new Thread(MethodReferenceExample :: printMessage);
		thread.start();
		
		List<Employee> employees = EmployeeDAO.getEmployees();
		// Method reference example 2
		//performConditionally(employees, employee -> true, employee -> System.out.println(employee));
		performConditionally(employees, employee -> employee.getSalary() > 50000, System.out :: println);
		
	}

	private static void printMessage(){
		System.out.println("Method referenece class");
	}
	
	

private static void performConditionally(List<Employee> employees, Predicate<Employee> predicate,
		Consumer<Employee> consumer) {
	for (Employee employee : employees) {
		if(predicate.test(employee)){
			consumer.accept(employee);
		}

}
}
}
