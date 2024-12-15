package Threads;

public class Threading extends Thread{
	public void run(){
		System.out.println("Thread is Running!");
	}

	public static void main(String[] args) {
		Threading t1 = new Threading();
		t1.start();
	}
}
