package exercicioSala;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcServer extends UnicastRemoteObject implements Calc  {


	public CalcServer() throws RemoteException {}

	@Override
	public int areaQuadrado(int a)throws RemoteException {
		return a * a;
	}

	@Override
	public int areaRetangulo(int a, int b) throws RemoteException {
		return a * b;
	}

	@Override
	public double areaTriangulo(int a, int b, int c) throws RemoteException {
        double result = (double) (a + b + c) / 2;
        return Math.pow(result*(result-a)*(result-b)*(result-c), 0.5);
	}

	@Override
	public double areaCirculo(int raio) throws RemoteException {
		return (double) (raio * raio)* Math.PI;
	}

	
	
	
}
