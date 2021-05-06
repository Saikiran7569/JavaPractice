
package syne.thread.classess.synchronization;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab_Excecutors {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
		Thread thread1 = new Thread(new Lab2Support(list));
		thread1.setName("X");
		Thread thread2 = new Thread(new Lab2Support(list));
		thread2.setName("O");
		Thread thread3 = new Thread(new Lab2Support(list));
		thread3.setName("B");
		thread1.start();
		thread2.start();
		thread3.start();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("List Size  " + list.size());

	}

}

class LabExSupport implements Runnable {

	List<String> list;

	public LabExSupport(List<String> list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {
			list.add(Thread.currentThread().getName() + " " + i);

		}

	}

}
