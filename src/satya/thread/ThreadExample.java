package satya.thread;

public class ThreadExample {
	
	public static void main(String[] args) {
		
		Thread thread = new MyThread("A");
		Thread thread1 = new MyThread("B");
		Thread thread2 = new MyThread("C");
		Thread thread3 = new MyThread("D");
		thread.start();
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}

class MyThread extends Thread {
	private String name;
	public MyThread(String string) {
		this.name = string;
	}

	@Override
	public  void run() {
		
		synchronized (MyThread.class) {
			for (int i = 0; i < 10; i++) {
				System.out.print(name+i + ",");
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
		
	}
}
