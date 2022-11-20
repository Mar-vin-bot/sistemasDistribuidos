package app;

import java.util.Random;

public class Fork extends Thread {

	private final int leftFork;
	private final int rightFork;

	public Fork(int leftFork, int rightFork) {
		this.leftFork = leftFork;
		this.rightFork = rightFork;
	}

	@Override
	public void run() {
		while (true) {
			try {
				
				sorteioLeftFork();
				sorteioRightFork();
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	public static int sorteioLeftFork() {
		int leftFork;
		Random d = new Random();
		 return leftFork = d.nextInt(5);
		 //System.out.println("Garfo da esquerda sorteado "+leftFork);
	}
	
	public static int sorteioRightFork() {
		int rightFork;
		Random d = new Random();
		 return rightFork = d.nextInt(5);
		//System.out.println("Garfo da direita sorteado "+rightFork);
	}

}
