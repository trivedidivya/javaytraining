package incremental;

public class DisplayThread extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread());
	}
}
