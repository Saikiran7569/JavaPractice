package syne.thread.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class MyRecursiveTask extends RecursiveTask<List<String>> {
	private List<String> inputlist;
	private Predicate<String> pred;

	@Override
	protected List<String> compute() {

		// TODO Auto-generated method stub
		// create a output list filtering the inputlist by using predicate
		List<String> li = new ArrayList<String>();
		li.add("str1");
		li.add("strstr2");
		li.add("strstr3");
		Predicate<String> p = a -> a.length() > 4;
		List<String> computedList = li.stream().filter(a -> p.test(a)).collect(Collectors.toList());
		return computedList;
	}

}

public class Lab8 {
	public static void main(String[] args) {

	}
}