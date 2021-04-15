package practice.java;

public class Overloading {

	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		o.m1(null);
		
		Boolean b1 = new Boolean("TRue");
		
		if(b1) {
			System.out.println("gdfrefdr");
		}

	}

	public void m1(String s) {
		System.out.println("String");
	}
	public void m1(Object s) {
		System.out.println("Object");
	}
}
