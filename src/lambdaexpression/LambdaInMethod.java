package lambdaexpression;

interface LambdaInterface{
	String run(String str);
}

public class LambdaInMethod {

	public static void main(String[] args) {
		LambdaInterface format1 = (s) -> s + '!';
		LambdaInterface format2 = (s) -> s + '?';
		
		printFormat("Debasmita", format1);
		printFormat("Who are you", format2);

	}
	
	public static void printFormat(String str , LambdaInterface format) {
		String string = format.run(str);
		System.out.println(string);
	}

}
