package oop;

import java.util.Random;

public class BankAccount extends Thread{
	public StringBuffer message;
	public boolean flag = true;
	volatile double account;
	
	BankAccount(double money){
		this.account = money;
	}
	
	public void ModifyBalance(double x){
		account += x;
		check();
		if (x < 0){
			this.message.append("Снятие: ");
		} else {
			this.message.append("Пополнение: ");
		}
	}
	
	public void check(){
		if (account < 0){
			System.out.println("Ошибка: баланс меньше нуля");
			flag = false;
		}
	}
	
	public void run(){
		while(flag) {
			Random r = new Random();
			double l = r.nextInt();
			ModifyBalance(l);
            Main.test(message + " " + l);
            message.delete(0, message.length() - 1);
        }
	}

}
