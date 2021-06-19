package echo.ex03;

public class MultiThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread thread01 = new UpperThread();
		Thread thread02 = new DigitThread();
		Thread thread03 = new LowerThread();
		
		
		thread01.start();
		thread02.start();
		thread03.start();
		
	}

}
