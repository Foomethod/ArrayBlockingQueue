import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Task2 implements Runnable{

	ArrayBlockingQueue<Integer> bqueue;
	
	public Task2(ArrayBlockingQueue<Integer> bqueue)
	{
		this.bqueue = bqueue;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				System.out.printf("The element %d is taken!\n", bqueue.take());
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
