
public class Threads_1 {
	public static void main(String[] args) {
		
//		Thread t = Thread.currentThread();
//		System.out.println(t.getName());

		Thread showThread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
		Thread t0 = new Thread(new MeuRunnable());
		Thread t1 = new Thread(new MeuRunnable());
		Thread t2 = new Thread(new MeuRunnable());
		Thread t3 = new Thread(new MeuRunnable());
		Thread t4 = new Thread(new MeuRunnable());
		Thread t5 = new Thread(new MeuRunnable());
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		}
}
