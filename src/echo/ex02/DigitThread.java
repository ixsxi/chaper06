package echo.ex02;

public class DigitThread extends Thread  {

	@Override
	public void run()  {
		 // 0~9 출력
		
		for(int i =0; i<=9; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	 
	
}
