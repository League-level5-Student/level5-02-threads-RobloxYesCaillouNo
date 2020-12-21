package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{
	int threadInt;
	
	public ThreadedGreeter(int h) {
		threadInt = h;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(threadInt <= 50) {
			System.out.println("wazzup from thread no: " + threadInt);
			Thread thread = new Thread(() -> { threadInt++; 
			});
			thread.start();
		
		}
	}

}
