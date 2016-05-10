import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Task1 implements Runnable
{
	public ArrayBlockingQueue<Integer> bqueue;
	
	public Task1(ArrayBlockingQueue<Integer> bqueue)
	{
		this.bqueue = bqueue;
	}

	public void run() {
		while(true)
		{
			Random rand = new Random();
			int counter = 0;
			
			if(counter != 5)
			{
				int genNum = rand.nextInt(100) + 1;
				try {
					bqueue.put(genNum);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(genNum + " is added to BlockingQueue.");
				counter++;
			}
			else
			{
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				counter = 0;
			}
		}
	}
}