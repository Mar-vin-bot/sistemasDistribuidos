
public class Synchronized_1 {
	static int i = -1;

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

	/*
	 * possivel saida sem o Synchronized
	 * 
	 * Thread-0: 0 Thread-2: 2 Thread-1: 1 Thread-4: 3 Thread-3: 4
	 */

	/*
	 * 
	 * public static class MeuRunnable implements Runnable {
	 * 
	 * @Override public void run() {
	 * 
	 * i++; String name = Thread.currentThread().getName();
	 * 
	 * System.out.println(name + ": " + i);
	 * 
	 * } }
	 */

	/*
	 * A ordem das threads podem mudar, mas a saída continua a mesma; Com o
	 * synchronized no método run, apenas uma thread pode executar o run por vez;
	 * Não existe mais paralelilismo; -> DESVANTAGEM A concorrência pela variável i
	 * é eliminada.
	 */

	/*os valores atribuidos a thread é sempre na ordem, contudo a sequencia das
	 * thread altera de acordo com a execução
	 * 
	 * Thread-0: 0 
	 * Thread-4: 1 
	 * Thread-3: 2 
	 * Thread-2: 3 
	 * Thread-1: 4
	 * 
	 */

	public static class MeuRunnable implements Runnable {

		@Override
		public synchronized void run() {

			i++;
			String name = Thread.currentThread().getName();

			System.out.println(name + ": " + i);
		}

	}

}
