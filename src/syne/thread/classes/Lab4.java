package syne.thread.classes;
 import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    class Lab4Helper extends Thread{
      private String str1;
      private String str2;
      public Lab4Helper(String str1, String str2) {
        super();
        this.str1 = str1;
        this.str2 = str2;
      };

      @Override
      public void run() {
        System.out.println("Run of  " + Thread.currentThread().getName()+ " Started");
        synchronized (str1) {
          System.out.println( Thread.currentThread().getName()+ " has taken the lock on "+ str1 + " and now waiting for next string");
          try{Thread.sleep(5000);}catch(Exception e){}
          synchronized (str2) {
            System.out.println(Thread.currentThread().getName()+ " has taken the lock on " + str1 + " " + str2);
            try{Thread.sleep(5000);}catch(Exception e){}
          }
        }
      }
    }

    public class Lab4 {

      public static void main(String[] args) throws Exception {

        System.out.println("Enter a number to continue..");
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

        String str1= "str1";
        String str2="str2";
        Lab4Helper t1 = new Lab4Helper(str1, str2);
        Lab4Helper t2 = new Lab4Helper(str2, str1);
        t1.start();
        t2.start();
    }
    }