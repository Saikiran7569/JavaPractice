package java8;
    
import java.util.*;
import java.util.stream.Collectors;


public class Person {
    String name;
    int votes;
    
    
    @Override
	public String toString() {
		return "Person [name=" + name + ", votes=" + votes + "]";
	}

	Person(String name, int vote) {
        this.name = name;
        this.votes = vote;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getVotes() {
        return this.votes;
    }
    
    public static void main(String []args){
        Person abc = new Person("ABC", 23);
        Person xyz = new Person("XYZ", 40);
        Person efg = new Person("EFG", 32);
        
        List<Person> personList = Arrays.asList(abc, xyz, efg);
        List<Person> collect = personList.stream().sorted(Comparator.comparing(Person::getVotes).reversed()).collect(Collectors.toList());
        
        collect.forEach(System.out::println);
        Person maxVotes = personList.stream().max(Comparator.comparing(Person::getVotes)).orElseThrow(NoSuchElementException::new);
        System.out.println(maxVotes.getName());
    }
} 



