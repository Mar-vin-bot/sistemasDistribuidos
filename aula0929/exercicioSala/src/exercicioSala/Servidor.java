package exercicioSala;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor {

	public static void main(String[] args) {


		try {

			LocateRegistry.createRegistry(2335);
			CalcServer f = new CalcServer();
			Naming.rebind("//localhost:2335/calc", f);
			System.out.println("Servidor calcular area, pronto.");
		} catch (RemoteException re) {
			System.out.println(" Exception in " + re);

		} catch (Exception e) {
			e.printStackTrace();
		}

	
		
	}
}
	

