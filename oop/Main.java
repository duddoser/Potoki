package oop;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception{
        // процесс (программа)
        // поток
        // 1. extends Thread => run();
        // 2. implements Runnable => run();

        // анонимный класс

        //new MyThread("+").start();
    	
    	
    	
    	BankAccount ba1 = new BankAccount(100);
    	ba1.start();
    	BankAccount ba2 = new BankAccount(100);
    	ba2.start();

    }

    private static Object key = new Object();
    public static void test(String string) {
        try {
        	synchronized(key){
        		System.out.print("|");
        		System.out.print(string);
        		System.out.print("|");
        		Thread.sleep(1000);
//        		key.notify();
//        		key.wait();
        		}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
