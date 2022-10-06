import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class VerificaNumber extends UnicastRemoteObject implements InterfaceServer  {

	protected VerificaNumber() throws RemoteException {}

	@Override
	public String evenOrOdd(int x) {
		if(x % 2 == 0) return "Par";
		return "Impar";
	}

	@Override
	public String primoOrNot(int x) {
        for (int z = 2; z < x; z++) {
            if (x % z == 0) return "Não é primo";
        }
        return "Primo";
    }

	@Override
	public String divisivelPorNumber(int x, int y) {
		if(x % y == 0) return "Numero é divisivel";
		return "Não é divisivel";
	}

}
