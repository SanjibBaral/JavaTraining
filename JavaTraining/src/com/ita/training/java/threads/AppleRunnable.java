package com.ita.training.java.threads;

public class AppleRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<200;i++) {
			System.out.println("Printing Apple for "+i+" time.");
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}

}
