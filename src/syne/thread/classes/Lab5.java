package syne.thread.classes;

import java.util.Scanner;

class Lab5Support implements Runnable {
	private String name;

	public Lab5Support(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + name + ", current i = " + i);
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Lab5 {

	public static void main(String[] args) {
		System.out.println("Enter  a number to continue");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		Thread thread1 = new Thread(new Lab5Support("Place1"));
		Thread thread2 = new Thread(new Lab5Support("Place2"));
		Thread thread3 = new Thread(new Lab5Support("Place3"));
		thread1.start();
		thread2.start();
		thread3.start();
	}

}