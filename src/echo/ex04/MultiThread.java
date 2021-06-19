package echo.ex04;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//DigitRunImableImpl digit = new DigitRunImableImpl();
		Thread thread = new Thread(new DigitRunImableImpl());
		
		thread.start();
		
		for(char ch='a'; ch<='z'; ch ++) {
			System.out.println(ch);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
