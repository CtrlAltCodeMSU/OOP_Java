package Threads;

public class Threading2 extends Thread{
	private String name;

	public Threading2(String name) {
		this.name = name ;
	}
	public void run(){
		for (int i= 1 ; i <= 5 ; i++){
			System.out.println(name + " is running: " + i);
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Threading2 t1 = new Threading2("Thread1");
		Threading2 t2 = new Threading2("Thread2");

		t1.start();
		t2.start();

	}
}
