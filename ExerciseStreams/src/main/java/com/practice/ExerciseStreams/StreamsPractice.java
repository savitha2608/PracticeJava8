package com.practice.ExerciseStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsPractice {

	public static void main(String[] args) {
		
		//Employees stream
		List<Employee> employees = EmployeeDAO.getEmployees();
		
		//Comparator sort
		Collections.sort(employees, new MyComparator());
		System.out.println(employees);
		
		// Lambda expression
		//Collections.sort(employees, (emp1, emp2) -> (int) (emp1.getSalary() - emp2.getSalary()));
		
		// Method reference
		employees
				.stream()
				.sorted(Comparator.comparing(Employee::getEmpName))
				.forEach(System.out :: println);
		
		
		
		List<String> someBingoNumbers = Arrays.asList(
	            "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number -> {
//            if(number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));
        someBingoNumbers
                .stream()
                .map(String::toUpperCase) // Returns a stream of the result of function argument
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("-----------------------");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());
				
	}
	
	

}
