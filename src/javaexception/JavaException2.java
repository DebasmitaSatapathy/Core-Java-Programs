package javaexception;

public class JavaException2 {

	public static void main(String[] args) throws Exception {

		display();
		handleException(2);
		handleException(3);
		handleException(1);
		handleException(10);

	}

	public static void display() throws RuntimeException {

	}

	private static void handleException(int i) throws Exception {

		if (i == 1) {
			throw new Exception();
		}
		if (i == 2) {
			throw new MyException();
		}
		if (i == 3) {
			throw new ChildException();
		}
	}

}

class MyException extends Exception {

}

class ChildException extends MyException {

}