package syne.thread.classes;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Lab2Support implements Callable<Integer> {
        private int no1;
        private int no2;

        public Lab2Support(int no1, int no2) {
          super();
          this.no1 = no1;
          this.no2 = no2;
        }	

        @Override
        public Integer call() throws Exception {
          System.out	.println("call invoked with " + no1 + ", " + no2 + " with thread " + Thread.currentThread().getName());
          Thread.sleep(1000);
          return no1 + no2;
        }

      }

      public class Lab2 {

        public static void main(String[] args) {
          // TODO Auto-generated method stub
          System.out.println("Enter  a number to continue");
          Scanner scanner = new Scanner(System.in);
          scanner.nextInt();

      //		ExecutorService service = Executors.newSingleThreadExecutor();
      //		ExecutorService service = Executors.newFixedThreadPool(2);
          ExecutorService service = Executors.newCachedThreadPool();
          service.submit(new Lab2Support(10, 20));
          service.submit(new Lab2Support(101, 20));
          service.submit(new Lab2Support(102, 20));
          service.submit(new Lab2Support(102, 20));
          service.shutdown();

        }

      }