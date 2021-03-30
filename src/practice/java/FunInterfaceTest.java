package practice.java;

import java.util.ArrayList;
import java.util.HashMap;

public class FunInterfaceTest {

	public static void main(String[] args) {

		System.out.println(20/0);
		
		
		/*
		 * Person p = new PersonImpl();
		 * 
		 * HashMap<K, V> p.prints(); ArrayList LinkedList { p.prints public void print()
		 * { System.out.println("sai"); }
		 * 
		 * }; p.prints();
		 */
	}

}

abstract class Person {

	public abstract void print();

	public void prints() {
		System.out.println("Saikiran");
	}
}

class PersonImpl extends Person {

	public void print() {
		System.out.println("Jammu");

	}

}