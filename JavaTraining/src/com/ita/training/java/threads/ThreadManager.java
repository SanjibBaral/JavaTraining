package com.ita.training.java.threads;

public class ThreadManager {
	
	public static void main(String[] args) {
		Apple a1=new Apple();
		Samsung s1=new Samsung();
		
		a1.start();
		s1.start();
		
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
