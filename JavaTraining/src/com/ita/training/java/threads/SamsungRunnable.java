package com.ita.training.java.threads;

public class SamsungRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<200;i++) {
			System.out.println(" Samsung printed for "+i+" time.");
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}

}
