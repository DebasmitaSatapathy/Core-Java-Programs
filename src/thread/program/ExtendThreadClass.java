package thread.program;

public class ExtendThreadClass {

	public static void main(String[] args) {
		ThreadExample thread1 = new ThreadExample("A");
		ThreadExample thread2 = new ThreadExample("B");
		ThreadExample thread3 = new ThreadExample("C");
		ThreadExample thread4 = new ThreadExample("D");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}

class ThreadExample extends Thread{
	String name;
	public ThreadExample(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.print(name + i + " ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Exception in Thread Execution");
			}
		}
	}
}
