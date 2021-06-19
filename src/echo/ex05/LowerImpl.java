package echo.ex05;

public class LowerImpl implements Runnable {

	@Override
	public void run() {
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