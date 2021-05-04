package syne.thread.classess.synchronization;

import java.util.Scanner;
import java.util.stream.Stream;

public class Lab8 {

	public static void main(String[] args) {
		ThreadGroup cargroup = new ThreadGroup("car");
		ThreadGroup obstacleGroup = new ThreadGroup("obstacle");
		
		Thread t1 = new Thread(cargroup,new Car(),"Car-1");
		Thread t2 = new Thread(cargroup,new Car(),"Car-2");
		Thread t3 = new Thread(obstacleGroup,new Obstacle(),"OBS-1");
		Thread t4 = new Thread(obstacleGroup,new Obstacle(),"OBS-2");
		Thread t5 = new Thread(obstacleGroup,new Obstacle(),"OBS-3");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.setDaemon(true);
		System.out.println("group count "+ cargroup.activeCount());
		System.out.println("group count "+ obstacleGroup.activeCount());
		cargroup.list();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter to stop C / O");
		String str = scanner.next();
		if(str.equalsIgnoreCase("C")) {
			Thread[] list = new Thread[5];
			cargroup.enumerate(list);
			Stream.of(list).forEach(System.out::println);
		}else if(str.equalsIgnoreCase("O")) {
			
		}
	}

}


class Car implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Car"+Thread.currentThread().getName());
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}
	
}

class Obstacle implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Obstacle"+Thread.currentThread().getName());
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}
	
}