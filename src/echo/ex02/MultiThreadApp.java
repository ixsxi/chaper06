package echo.ex02;

public class MultiThreadApp {

	public static void main(String[] args) throws Exception {
		
		Thread thread = new DigitThread();
		thread.start(); // start() 내부에 출장준비 내부에서 run() 실행
		//thread.run();
		
		for(char ch='A'; ch<='Z'; ch ++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
	}

}
