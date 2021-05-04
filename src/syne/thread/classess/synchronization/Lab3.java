package syne.thread.classess.synchronization;
import java.util.Scanner;

	class Account1 {
		private String acno;
		private int balance;

		public Account1(String acno, int balance) {
			this.acno = acno;
			this.balance = balance;
		}

		public String getAcno() {
			return acno;
		}

		public void setAcno(String acno) {
			this.acno = acno;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}
	}

	class Deposit1 implements Runnable {
		private Account1 acc;

		public Deposit1(Account1 acc) {
			this.acc = acc;
		}

		@Override
		public void run() {
			try{
			int balance = acc.getBalance();
			System.out.println("before - in Deposit1, current balance is   " + balance);
			balance += 100;
			acc.setBalance(balance);
			System.out.println("after - in Deposit1, current balance is " + acc.getBalance());
			if (acc.getBalance() >= 100)
				{
					System.out.println("balance is > 100 so can notify .. take a dump");
					Thread.sleep(5000);
					synchronized (acc) {
					acc.notify();
				}	
					System.out.println("notified.... .. take a dump");
					Thread.sleep(5000);
			}
			}catch(Exception e){System.out.println(e);}
		}
	}

	class Widraw implements Runnable {
		private Account1 acc;

		public Widraw(Account1 acc) {
			this.acc = acc;
		}

		@Override
		public void run() {
			try {
				int balance = acc.getBalance();
				synchronized (acc) {
					if (balance <= 100) {
						acc.wait();
					}
					System.out.println("..before - in Widraw, current balance is   " + balance);
					balance -= 100;
					acc.setBalance(balance);
				}	
					System.out.println("..after - in Widraw, current balance is " + acc.getBalance());


			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public class Lab3 {

		public static void main(String[] args) {
			System.out.println("Enter  a number to continue");
			Scanner scanner = new Scanner(System.in);
			scanner.nextInt();
			Account1 acc = new Account1("Ac01", 0);
			for (int i = 1; i <= 1; i++) {
				Thread t1 = new Thread(new Deposit1(acc));
				Thread t2 = new Thread(new Widraw(acc));
				t1.start();
				t2.start();
			}
		}

	}