import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args) {
		
		InterfaceServer inter;
		
		try {
			
			Scanner sc = new Scanner(System.in);
			 inter = (InterfaceServer) Naming.lookup("rmi://localhost:2335/area");
			 	
	            System.out.println("Digite um numero");
	            int num = sc.nextInt();	
	            
	            System.out.println("Informe o número divisor!");
	            int number = sc.nextInt();
	            
	            System.out.println(inter.evenOrOdd(num));
	            System.out.println(inter.primoOrNot(num));
	            System.out.println(inter.divisivelPorNumber(num, number));
			
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
