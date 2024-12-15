package Threads;

public class Threading1 implements Runnable{
	public void run(){
		System.out.println("Thread is Running!");
	}

	public static void main(String[] args) {
		Threading1 myRunnable = new Threading1();
		Thread t1 = new Thread(myRunnable);
		t1.start();
	}
}
