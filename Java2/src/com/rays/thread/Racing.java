package com.rays.thread;

public class Racing  extends Thread{
	String name= null;
	public static AccountRC account = new AccountRC();
	public Racing (String name) {
		this.name = name;
		
	}
	@Override
	public void run() {
		for (int i=1; i<=5; i++ );
		account.deposit(name, 100);
	System.out.println(name+ "Balance"+ account.getBalance());
	}
	

}
