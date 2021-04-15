package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Employee Name: " + name + " age: " + age;
	}
}

public class FileterJava8 {

	public static void main(String[] args) {

		String[] strs = { "Believe", "for", "good", "Believe", "for", "trust", "Believe", "forsake", "Believe",
				"Believe", "in", "you", "youtube", "Google", "for", "learning", "virtual", "data" };

		int[] num = { 2, 44, 3, 22, 5, 55, 3, 2, 1, 1, 1, 5, 5, 6, 67, 7, 5 };
		List<String> names = Arrays.asList(strs);
		Optional<String> reduce = names.stream().reduce((s1,s2)->s1+"_"+s2);
		if(reduce.isPresent()) System.out.println("reduce ++++++++++" +reduce.get());
		
		System.out.println("----------------------------------");
		// Finding duplicates
		Map<String, Long> outDuplicates = names.stream()
				.collect(Collectors.groupingBy(String::new, Collectors.counting()));
		LinkedHashMap<String, Long> sortedMap = outDuplicates.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		sortedMap.forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println("----------------------------------");
		// sorting based on frequency
		List<String> sortedArray = names.stream().filter(i -> Collections.frequency(names, i) > 4)
				.sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		// collect(Collectors.toList());

		sortedArray.forEach(System.out::println);

		System.out.println("----------------------------------");
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(2);
		numList.add(23);
		numList.add(43);
		numList.add(21);
		numList.add(21);
		numList.add(12);
		numList.add(32);
		numList.add(2);
		numList.add(65);
		numList.add(65);
		numList.add(65);
		numList.add(21);
		numList.add(54);
		numList.add(54);
		Map<Integer, Long> intDuplicate = numList.stream()
				.collect(Collectors.groupingBy(Integer::new, Collectors.counting()));
		intDuplicate.forEach((k, v) -> System.out.println(k + ":" + v));

		System.out.println("----------------------------------");

		OptionalInt maxvalue = numList.stream().mapToInt(Integer::new).max();
		if (maxvalue.isPresent()) {
			System.out.println("Max value " + maxvalue.getAsInt());
		}

		System.out.println("----------------------------------");
		List<Employee> emps = new ArrayList<Employee>();
		Employee e1 = new Employee("Sai1", 1); Employee e2 = new Employee("Sai2", 1);
		Employee e3 = new Employee("Sai3", 1); Employee e4 = new Employee("Sai4", 1);
		Employee e5 = new Employee("Sai5", 1); Employee e6 = new Employee("Sai6", 1);
		Employee e7 = new Employee("Sai7", 1); Employee e8 = new Employee("Sai8", 1);
		emps.add(e1);emps.add(e2);emps.add(e3);emps.add(e4);emps.add(e5);emps.add(e6);emps.add(e7);emps.add(e8);
		
		List<String> collect = emps.stream().map(Employee::getName).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		
		
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");

	}

}
