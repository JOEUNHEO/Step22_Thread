package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		//1. MyThread Ŭ������ extends Thread
		new MyThread().start();
		//2. MyRunnable Ŭ������ implements Runnable
		Runnable run = new MyRunnable();
		new Thread(run).start();
		//3. �͸��� local inner class extends Thread
		new Thread() {
			@Override
			public void run() {
				
			}
		}.start();
		//4. �͸��� local inner class implements Runnable
		new Thread(new Runnable(){
			@Override
			public void run() {
								
			}
			
		}).start();
	}
	//1.
	static class MyThread extends Thread{
		@Override
		public void run() {
			
		}
	}
	//2.
	static class MyRunnable implements Runnable{
		@Override
		public void run() {
			
		}
		
	}
}
