package com.practice.ExerciseStreams;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class SortMapDemo {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 8);
		map.put(2, 4);
		map.put(5, 10);
		map.put(3, 2);

		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		employeeMap.put(new Employee(176, "Roshan", "IT", 600000,34), 60);
		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000, 37), 90);
		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000, 44), 50);
		employeeMap.put(new Employee(624, "Sourav", "CORE", 400000, 32), 40);
		employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000, 31), 120);

		//System.out.println(employeeMap);
		
		map.entrySet()
					.stream()
					.sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
					.forEach(System.out::println);
		
		/*List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));*/
		
		/*
		 * for (Entry<String, Integer> entry : entries) {
		 * System.out.println(entry.getKey() + "   " + entry.getValue()); }
		 */

		// map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("****************************");
		// map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		employeeMap
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
				.forEach(System.out::println);

	}
}
