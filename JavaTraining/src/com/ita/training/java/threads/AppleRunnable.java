package com.ita.training.java.threads;

public class AppleRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("Printing Apple for "+i+" time.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
