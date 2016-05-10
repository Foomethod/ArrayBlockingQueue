import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main{

	public static void main(String args[])
	{
		ArrayBlockingQueue<Integer> a = new ArrayBlockingQueue<Integer>(5);
		Task1 task1 = new Task1(a);
		Task2 task2 = new Task2(a);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
	}
}
