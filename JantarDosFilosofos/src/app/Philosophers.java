package app;


public class Philosophers extends Thread {

	String name;
	Fork fork;

	
	public Philosophers() {}

	public Philosophers(String name, Fork fork) {
		this.name = name;
		this.fork = fork;

		System.out.println("O filosofo "+ name +" sentou na mesa");
	}

	public void toThink() throws InterruptedException {

		System.out.println("O filosofo " + name + " esta pensando");
		Thread.sleep(1000);

	}

	@Override
	public void run() {

		while (true) {

			if (Fork.sorteioRightFork() == 5) {
				System.out.println("O filosofo " + name + " pegou o garfo " + Fork.sorteioRightFork());

				if (Fork.sorteioLeftFork() == 1) {
					System.out.println("O filosofo " + name + " pegou o garfo da esquerda " + Fork.sorteioLeftFork());
					System.out.println("O filosofo " + name + " esta comendo");
					System.out.println("O filosofo " + name + " largou o garfo da direita");
					System.out.println("O filosofo " + name + " largou o garfo da esquerda");
				} else {
					System.out.println("O filosofo " + name + " largou o garfo da direita " + Fork.sorteioRightFork());
				}

			} else {
				try {
					toThink();
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}

			if (Fork.sorteioRightFork() == 1) {
				System.out.println("O filosofo " + name + " pegou o garfo " + Fork.sorteioRightFork());

				if (Fork.sorteioLeftFork() == 2) {
					System.out.println("O filosofo " + name + " pegou o garfo da esquerda " + Fork.sorteioLeftFork());
					System.out.println("O filosofo " + name + " esta comendo");
					System.out.println("O filosofo " + name + " largou o garfo da direita");
					System.out.println("O filosofo " + name + " largou o garfo da esquerda");
				} else {
					System.out.println("O filosofo " + name + " largou o garfo da direita " + Fork.sorteioRightFork());
				}

			} else {
				try {
					toThink();
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}

			if (Fork.sorteioRightFork() == 2) {
				System.out.println("O filosofo " + name + " pegou o garfo " + Fork.sorteioRightFork());

				if (Fork.sorteioLeftFork() == 3) {
					System.out.println("O filosofo " + name + " pegou o garfo da esquerda " + Fork.sorteioLeftFork());
					System.out.println("O filosofo " + name + " esta comendo");
					System.out.println("O filosofo " + name + " largou o garfo da direita");
					System.out.println("O filosofo " + name + " largou o garfo da esquerda");
				} else {
					System.out.println("O filosofo " + name + " largou o garfo da direita " + Fork.sorteioRightFork());
				}

			} else {
				try {
					toThink();
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}

			if (Fork.sorteioRightFork() == 3) {
				System.out.println("O filosofo " + name + " pegou o garfo " + Fork.sorteioRightFork());

				if (Fork.sorteioLeftFork() == 4) {
					System.out.println("O filosofo " + name + " pegou o garfo da esquerda " + Fork.sorteioLeftFork());
					System.out.println("O filosofo " + name + " esta comendo");
					System.out.println("O filosofo " + name + " largou o garfo da direita");
					System.out.println("O filosofo " + name + " largou o garfo da esquerda");
				} else {
					System.out.println("O filosofo " + name + " largou o garfo da direita " + Fork.sorteioRightFork());
				}

			} else {
				try {
					toThink();
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}

			if (Fork.sorteioRightFork() == 4) {
				System.out.println("O filosofo " + name + " pegou o garfo " + Fork.sorteioRightFork());

				if (Fork.sorteioLeftFork() == 5) {
					System.out.println("O filosofo " + name + " pegou o garfo da esquerda " + Fork.sorteioLeftFork());
					System.out.println("O filosofo " + name + " esta comendo");
					System.out.println("O filosofo " + name + " largou o garfo da direita");
					System.out.println("O filosofo " + name + " largou o garfo da esquerda");
				} else {
					System.out.println("O filosofo " + name + " largou o garfo da direita " + Fork.sorteioRightFork());
				}

			} else {
				try {
					toThink();
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}

		}

	}

	public void test() {
			
	Fork f1 = new Fork(1,5);
	Fork f2 = new Fork(2,1);
	Fork f3 = new Fork(3,2);
	Fork f4 = new Fork(4,3);
	Fork f5 = new Fork(5,4);
	
	Philosophers p1 = new Philosophers("Platão", f1);
	Philosophers p2 = new Philosophers("Aristoteles", f2);
	Philosophers p3 = new Philosophers("Socrates", f3);
	Philosophers p4 = new Philosophers("Descartes", f4);
	Philosophers p5 = new Philosophers("Euclides", f5);
	
	new Thread(p1).start();
	new Thread(p2).start();
	new Thread(p3).start();
	new Thread(p4).start();
	new Thread(p5).start();
	
	}

}
