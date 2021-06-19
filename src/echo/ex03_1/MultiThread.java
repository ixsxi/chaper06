package echo.ex03_1;

public class MultiThread {

	public static void main(String[] args) {
		
		Thread thead01 = new DigitThread();
		Thread thead02 = new LowerThread();
		Thread thead03 = new UpperThread();
		
		
		
		thead01.start();
		thead02.start();
		thead03.start();
		

	}

}
