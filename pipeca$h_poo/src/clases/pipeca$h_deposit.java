package clases;

public class pipeca$h_deposit extends pipeca$h_abstract {

	@Override
	public void transacciones() {
         
		System.out.println("Cuanto quieres depositar:");
		deposit();
		
		transaccion = getSaldoActual(); 
		setSaldoActual(transaccion + deposito);
		System.out.println("Depositaste: "+ deposito);
		System.out.println("Tu saldo actual es: " + getSaldoActual());
	}

}
