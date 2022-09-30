package exercicioSala;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class Client {

	public static void main(String args[]) {
		Calc calc;
		
		
		try {
			calc = (Calc) Naming.lookup("rmi://localhost:2335/area");
            String parametro = "0";
            double area = 0.0;
            int inputA, inputB, inputC;
            System.out.println("Informe qual figura você deseja calcular a area(Quadrado, triangulo, retangulo, circulo!");
            while(parametro != "") {
                Scanner in = new Scanner(System.in);
                parametro = in.nextLine();
                
                switch(parametro) {
                    case "Quadrado":
                        inputA = in.nextInt();
                        area = calc.areaQuadrado(inputA);
                        System.out.println(" A area é: " + area);
                        break;
                    case "Retangulo":
                        inputA = in.nextInt();
                        inputB = in.nextInt();
                        area = calc.areaRetangulo(inputA, inputB);
                        System.out.println(" A area é " + area);
                        break;
                    case "Triangulo":
                        inputA = in.nextInt();
                        inputB = in.nextInt();
                        inputC = in.nextInt();
                        area = calc.areaTriangulo(inputA, inputB, inputC);
                        System.out.println(" A area eh: " + area);
                        break;
                    case "Circulo":
                        inputA = in.nextInt();
                        area = calc.areaCirculo(inputA);
                        System.out.println(" A area eh: " + area);
                        break;
                }
            }
		}
        catch(MalformedURLException e) {
            System.out.println( "nao eh um URL RMI valida");
        }
        catch(RemoteException re) {
            System.err.println("Objeto Remoto tratou a execucao " + re);
        }
        catch(NotBoundException e) {
            System.out.println( "Nao foi possivel achar o objeto remoto no servidor");
        }
    }
}