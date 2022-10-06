import java.rmi.Naming;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor {
	
	public static void main(String[] args) {
		
		try {

			LocateRegistry.createRegistry(2335);
			VerificaNumber f = new VerificaNumber();
			Naming.rebind("//localhost:2335/calc", f);
			System.out.println("Server is ready");
        }
        catch (RemoteException re) {
            System.out.println(" Exception in " + re);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
