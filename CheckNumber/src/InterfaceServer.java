import java.rmi.Remote;

public interface InterfaceServer extends Remote {

		public String evenOrOdd (int x);
		public String primoOrNot (int x);
		public String divisivelPorNumber (int x, int y);

}
