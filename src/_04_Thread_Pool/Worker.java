package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;
	public Worker(ConcurrentLinkedQueue<Task> taskQueue) {
		
		this.taskQueue = new ConcurrentLinkedQueue<Task>();
		this.taskQueue = taskQueue;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(taskQueue.isEmpty() == false) {
			Task tasque = taskQueue.remove();
			tasque.perform();
		}
	}
	


}
