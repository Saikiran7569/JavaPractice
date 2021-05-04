package syne.thread.classes;

import java.util.Scanner;

class Lab6Support implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print(Thread.currentThread().getName());
			if(i %8 ==0) {
				System.out.println("");
			}
			//Thread.yield();
		}
	}
}

public class Lab6 {

	public static void main(String[] args) {
		System.out.println("Enter  a number to continue");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		Thread thread1 = new Thread(new Lab6Support());
		thread1.setName("X");
		Thread thread2 = new Thread(new Lab6Support());
		thread2.setName("O");		
		Thread thread3 = new Thread(new Lab6Support());
		thread3.setName("B");
		thread1.start();
		thread2.start();
		thread3.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of main thread");
	}

}