package com.ita.training.java.threads;

public class RunnableManager {
	
	public static void main(String[] args) {
		AppleRunnable a1=new AppleRunnable();
		SamsungRunnable s1=new SamsungRunnable();
		
		Thread t1= new Thread(a1);
		Thread t2= new Thread(s1);
		
		t1.start();
		t2.start();
		for(int i=0;i<20;i++) {
			System.out.println("Main Method executed for "+i+" times.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
