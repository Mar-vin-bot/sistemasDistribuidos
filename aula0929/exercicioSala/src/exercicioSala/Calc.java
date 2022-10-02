package exercicioSala;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calc extends Remote {

	public int areaQuadrado (int a) throws RemoteException;
	public int areaRetangulo (int a, int b) throws RemoteException;
	public double areaTriangulo (int a, int b, int c) throws RemoteException;
	public double areaCirculo (int raio) throws RemoteException;
	
	
	
}


//teste