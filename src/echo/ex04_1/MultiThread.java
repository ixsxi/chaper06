package echo.ex04_1;

public class MultiThread {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new DigitRunableimpl());
		
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
