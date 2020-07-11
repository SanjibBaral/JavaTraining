package com.ita.training.java.threads;

public class Samsung extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(" Samsung printed for "+i+" time.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
