package clases;

public class pipeca$h_withdraw extends pipeca$h_abstract{
		
	public void transacciones() {
		System.out.print(boldea);
		System.out.print(boldeb);
		System.out.print(boldea);
		System.out.println("");
		System.out.print(boldea);
		System.out.print("Cuanto deseas retirar:   ");
		System.out.println(boldea);
		System.out.print(boldea);
		System.out.print(boldeb);
		System.out.print(boldea);
		retiro();
		if(retiro <= getSaldoActual()) {
			transaccion = getSaldoActual();
			setSaldoActual(transaccion - retiro);
			System.out.print(boldea);
			System.out.print(boldeb);
			System.out.print(boldea);
			System.out.println("");
			System.out.print(boldea);
			System.out.println("Retiraste: " + retiro);
			System.out.print(boldea);
		    System.out.print("Tu saldo actual es:  " + getSaldoActual());
		    System.out.println(boldea);
			System.out.print(boldea);
			System.out.print(boldeb);
			System.out.print(boldea);
			retiro();
		} else {
			System.out.println("Saldo insuficiente, u smart guy, aint u?");
		}
	}
}
