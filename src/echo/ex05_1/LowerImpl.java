package echo.ex05_1;

public class LowerImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		
		for(char ch = 'a'; ch<='z'; ch ++) {
			System.out.println(ch);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
