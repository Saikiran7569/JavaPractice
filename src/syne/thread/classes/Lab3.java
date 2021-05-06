package syne.thread.classes;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Lab3 {

	public static void main(String[] args) {
		Runnable run1 = ()->{System.out.println("in Run1 for thread  " + Thread.currentThread().getName() + "  " + new Date());};
		Runnable run2 = ()->{
			System.out.println("in Run2 for thread  " + Thread.currentThread().getName() + "  " + new Date());};
		Runnable run3 = ()->{
				System.out.println("in Run3 start - thread  " + Thread.currentThread().getName() + "  " + new Date());
				try{Thread.sleep(3000);}catch(Exception e){}
				System.out.println("in Run3 end - thread  " + Thread.currentThread().getName() + "  " + new Date());
		};
			
		System.out.println("Enter  a number to continue");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		System.out.println("main Starting "+ new Date());
		ScheduledExecutorService scheduledservice = 		     Executors.newScheduledThreadPool(1);
		//scheduledservice.schedule(run1, 5, TimeUnit.SECONDS);
		//scheduledservice.scheduleAtFixedRate(run2,5,2,TimeUnit.SECONDS);
		scheduledservice.scheduleWithFixedDelay(run3,1,2,TimeUnit.SECONDS);
		//scheduledservice.shutdown();

	}

}
