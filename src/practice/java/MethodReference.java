package practice.java;

public class MethodReference {

	public static void main(String[] args) {
		Sayable sayable = MRef::saySomething;
		
		sayable.say();

	}

}

interface Sayable {
	void say();
}

class MRef {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}
}




interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
@FunctionalInterface  
interface Sayable2 extends Doable{  
    void say(String msg);   // abstract method  
}
