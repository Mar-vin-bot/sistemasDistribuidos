
public class Synchronized_2 {
	static int i = 0;

	public static void main(String[] args) {
		MeuRunnable runnable = new MeuRunnable();
		
		Thread t0 = new Thread(runnable);
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		Thread t4 = new Thread(runnable);

		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	public static class MeuRunnable implements Runnable {

		@Override
		public void run() {
			int j;
			synchronized (this) {
				i++;
				j = i * 2;
			}

			double jElevadoa10 = Math.pow(j, 10);
			double sqrt = Math.sqrt(jElevadoa10);
			System.out.println(sqrt);
		}

	}

}
