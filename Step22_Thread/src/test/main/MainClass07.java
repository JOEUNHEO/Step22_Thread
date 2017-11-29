package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		//1. MyThread 클래스에 extends Thread
		new MyThread().start();
		//2. MyRunnable 클래스에 implements Runnable
		Runnable run = new MyRunnable();
		new Thread(run).start();
		//3. 익명의 local inner class extends Thread
		new Thread() {
			@Override
			public void run() {
				
			}
		}.start();
		//4. 익명의 local inner class implements Runnable
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
