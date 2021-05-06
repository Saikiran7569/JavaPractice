package syne.thread.classes;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Lab7Support implements Runnable {
	private CyclicBarrier barrier;

	public Lab7Support(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	@Override
	public void run() {
		try {
			System.out.println("design phase starting....." + Thread.currentThread().getName());
			Thread.sleep((int) (Math.random() * 1000));
			System.out.println("design phase ending and before await " + Thread.currentThread().getName());
			barrier.await();
			System.out.println("planning phase starting....." + Thread.currentThread().getName());
			Thread.sleep((int) (Math.random() * 1000));
			System.out.println("planning phase ending....." + Thread.currentThread().getName());
			barrier.await();
			System.out.println("coding phase starting....." + Thread.currentThread().getName());
			Thread.sleep((int) (Math.random() * 1000));
			System.out.println("coding phase ending.....");
			barrier.await();
			System.out.println("testing phase starting....." + Thread.currentThread().getName());
			Thread.sleep((int) (Math.random() * 1000));
			System.out.println("testing phase ending.....");
		} catch (Exception e) {
		}

	}
}

public class Lab7 {
	final static CyclicBarrier barrier = new CyclicBarrier(3);

	public static void main(String[] args) throws InterruptedException {

		ExecutorService service = Executors.newCachedThreadPool();
		service.submit(new Lab7Support(barrier));
		service.submit(new Lab7Support(barrier));
		service.submit(new Lab7Support(barrier));
		service.shutdown();
	}
}
