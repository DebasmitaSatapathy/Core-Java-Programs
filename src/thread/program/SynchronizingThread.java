package thread.program;

public class SynchronizingThread {

	public static void main(String[] args) {
		MyThreadExample thread1 = new MyThreadExample("A");
		MyThreadExample thread2 = new MyThreadExample("B");
		MyThreadExample thread3 = new MyThreadExample("C");
		MyThreadExample thread4 = new MyThreadExample("D");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}

class MyThreadExample extends Thread {
	String name;

	public MyThreadExample(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		synchronized (MyThreadExample.class) {
			for (int i = 0; i < 10; i++) {
				System.out.print(name + i + " ");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					System.out.println("Exception in Thread Execution");
				}
			}
		}

	}
}
