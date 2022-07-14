package thread.program;

public class IsAliveToAvoidConcurrency {

	public static void main(String[] args) {
		MyThreadConcurrency thread = new MyThreadConcurrency();
		thread.start();
		//System.out.println("amount= " + thread.amount);
		
		while (thread.isAlive()) {
			System.out.println("waiting...........");
		}
		
		System.out.println("amount= " + thread.amount);
		
		thread.amount++;
		System.out.println("amount= " + thread.amount);

		thread.amount++;
		System.out.println("amount= " + thread.amount);
	}

}

class MyThreadIsAlive extends Thread {
	int amount = 0;

	@Override
	public void run() {
		amount++;		
	}
}
