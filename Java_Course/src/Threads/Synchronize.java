package Threads;

class Counter {
	int count = 0 ;

	public synchronized void increment() {
		count++;
	}
}
class Mythread extends Thread {
	Counter counter ;
	Mythread(Counter counter){
		this.counter = counter ;
	}
	public void run() {
		for (int i = 0 ; i < 100 ; i++ ){
			counter.increment();
		}
	}

	public static void main(String[] args) {
		Counter counter = new Counter();
		Mythread t1 = new Mythread(counter);
		Mythread t2 = new Mythread(counter);

		t1.start();
		t2.start();
	}
}
