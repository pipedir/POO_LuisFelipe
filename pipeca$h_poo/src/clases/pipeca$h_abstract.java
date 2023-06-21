package clases;
import java.util.Scanner;

public abstract class pipeca$h_abstract {
	
	protected int transaccion, retiro, deposito;
	private static int saldoactual;
	Scanner in = new Scanner(System.in);
	String boldea = "|", boldeb="=========================";
	
	public void cashoperations() {
		int indicador =0;
		int selec=0;
		
		
		
		do {
		 do {
				String bbord="|", abord="=";
				int a=0;
				
				System.out.println("");
				System.out.print(bbord);
				while(a<50) {
					System.out.print(abord);
					a++;			
				}
				
				System.out.println(bbord);
				System.out.println("|========== Bienvenido a PipeCa$h v0.1 ============|");
				a=0;
				System.out.print(bbord);
				while(a<50) {
					System.out.print(abord);
					a++;
				}
				System.out.println(bbord);
				
				System.out.println("| --> Porfavor seleccione una opcion del menu <----|");
				System.out.println("|==================================================|");
				

			System.out.println(" 1. -------> Consulta saldo");
			System.out.println(" 2. -------> Retiro de efectivo");
			System.out.println(" 3. -------> Deposito de efectivo");
			System.out.println(" 4. -------> Salir");
			System.out.println("|==================================================|");
			System.out.print("------->");
			selec=in.nextInt();
			
			if(selec>=1 && selec<=4) {
				indicador = 1;
				
			}else {
				System.out.println("Opcion no disponible, vuelva a intentar. ");
			}
			
		 }while(selec==0);
		 
		 if(selec==1) {
			 pipeca$h_abstract mail = new pipeca$h_consulta();
			 mail.transacciones();
		 } else if(selec == 2) {
			 pipeca$h_abstract mail = new pipeca$h_withdraw();
			 mail.transacciones();
		 } else if (selec == 3) {
			 pipeca$h_abstract mail = new pipeca$h_deposit();
			 mail.transacciones();
		 } else if (selec == 4) {
			 System.out.println("Gracias!, porfavor vuelva pronto :)");
			 indicador = 2;
		 }
		 
		}while(indicador!=2);
		
	}
	
	// withdraw method
	
	public void retiro() {
		retiro=in.nextInt();
	}
	
	// deposit method
	
	public void deposit() {
		deposito=in.nextInt();
	}
	
	
	// abstract method
	public abstract void transacciones();
	
	// getter n´ setter saldoactual
	
	public int getSaldoActual(){
		return saldoactual;
	}
	
	public void setSaldoActual(int saldo){
		saldoactual = saldo;
	}
	

}



