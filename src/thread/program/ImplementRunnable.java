package thread.program;

public class ImplementRunnable {

	public static void main(String[] args) {
		MyRunnableThread obj1 = new MyRunnableThread("A");
		MyRunnableThread obj2 = new MyRunnableThread("B");
		MyRunnableThread obj3 = new MyRunnableThread("C");
		MyRunnableThread obj4 = new MyRunnableThread("D");

		Thread thread1 = new Thread(obj1);
		thread1.start();

		Thread thread2 = new Thread(obj2);
		thread2.start();

		Thread thread3 = new Thread(obj3);
		thread3.start();

		Thread thread4 = new Thread(obj4);
		thread4.start();
	}
}

class MyRunnableThread implements Runnable {
	String name;

	public MyRunnableThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(name + i + " ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
