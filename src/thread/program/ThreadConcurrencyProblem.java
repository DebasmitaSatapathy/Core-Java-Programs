package thread.program;

public class ThreadConcurrencyProblem {

	public static void main(String[] args) {
		MyThreadConcurrency thread = new MyThreadConcurrency();
		thread.start();
		System.out.println("amount= " + thread.amount);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
		thread.amount++;
		System.out.println("amount= " + thread.amount);
		
		thread.amount++;
		System.out.println("amount= " + thread.amount);
	}

}

class MyThreadConcurrency extends Thread{
	int amount = 0;
	@Override
	public void run() {
		amount++;				
	}
}
