package practice.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Sort {

	public static void main(String[] args) {
	String[] input = {"Believe", "for", "good", "Believe", "for", "trust", "Believe", "forsake", "Believe", "Believe", "in", "you", "youtube", "Google", "for", "learning", "virtual", "data"};
	
	
	List<String> asList = Arrays.asList(input);
	
	List<String> sortedArray = asList.stream().filter(i -> Collections.frequency(asList,i) > 4).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
			//collect(Collectors.toList());
	
	sortedArray.forEach(System.out::println);
	
	}

}
