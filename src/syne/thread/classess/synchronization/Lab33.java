package syne.thread.classess.synchronization;

import java.util.Scanner;

public class Lab33 {

	public static void main(String[] args) {
		System.out.println("Enter  a number to continue");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();

		Account acc = new Account(101, 0);

		for (int i = 1; i <= 1; i++) {
			Thread t1 = new Thread(new Deposit(acc));
			Thread t2 = new Thread(new Withdraw(acc));
			t1.start();
			t2.start();
		}
	}

}

class Deposit implements Runnable {
	private Account acc;

	public Deposit(Account acc) {
		super();
		this.acc = acc;
	}

	@Override
	public void run() {
		try {
			int balance = acc.getBalance();
			System.out.println("before in Deposite , current balance is " + balance);
			balance += 100;
			acc.setBalance(balance);
			System.out.println("after in Deposite , current balance is " + balance);

			if (acc.getBalance() >= 100) {
				System.out.println("balance is > 100 so can notify .. take a dump");
				Thread.sleep(5000);
				synchronized (acc) {
					acc.notify();
				}
			}
			System.out.println("notified.... .. take a dump");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Withdraw implements Runnable {
	private Account acc;

	public Withdraw(Account acc) {
		super();
		this.acc = acc;
	}

	@Override
	public void run() {
		try {
			synchronized (acc) {

				int balance = acc.getBalance();
				if (balance <= 100) {
					this.wait();
				}
				System.out.println("before in Withdraw , current balance is " + balance);
				balance -= 100;
				acc.setBalance(balance);

			}
			System.out.println("after in Withdraw , current balance is " + acc.getBalance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Account {

	private int acNum;
	private int balance;

	public Account(int acNum, int balance) {
		super();
		this.acNum = acNum;
		this.balance = balance;
	}

	public Account() {
	}

	public int getAcNum() {
		return acNum;
	}

	public void setAcNum(int acNum) {
		this.acNum = acNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
