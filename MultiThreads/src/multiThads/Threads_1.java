package multiThads;

public class Threads_1 {
	
	public static void main(String[] args) {
		//Thread t = Thread.currentThread();
		//System.out.println(t.getName());
		/*
		//nova Thread
		Thread t0 = new Thread(new MeuRunnable());
		t0.run();
		
		//nova Thread com Runnable como lambda
		Thread t1 = new Thread(new MeuRunnable());
		t1.start(); // executando em uma nova thread
		t1.start();
		
		//nova Thread com Runnable como lambda
		Thread t2 = new Thread(new MeuRunnable());
		t1.start(); // executando em uma nova thread
		t2.start(); // Não é possível iniciar a mesma thread 2x
		*/
		
		
		Thread t0 = new Thread(new MeuRunnable());
		Thread t1 = new Thread(new MeuRunnable());
		Thread t2 = new Thread(new MeuRunnable());
		t0.start();
		t1.start();
		t2.start();
		Thread showThread = new Thread(() -> System.out.println(Thread.currentThread().getName()));

		}

}
