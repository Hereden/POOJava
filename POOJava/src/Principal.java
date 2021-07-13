import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		CuentaBancaria cuenta_personal = new CuentaBancaria("Carlos eduardo", 1461.14f);
		//cuenta_personal.setSaldo(-1239.76f);
		//System.out.println(cuenta_personal.getSaldo());
		//CuentaBancaria cuenta_secundaria= new CuentaBancaria();
		/*
		 * Menú cajero.
		 * 1. Retiro
		 * 2. Deposito
		 * 3. Imprimir saldo
		 * 4. Estado de cuenta
		 * 5. Agregar beneficiario
		 * 6. Salir*/
		
		
		int opcion=0;
		String s="Ingresa la opción deseada"+
		"1. Retiro\r\n"
		+ "2. Deposito\r\n"
		+ "3. Imprimir saldo\r\n"
		+ "4. Estado de cuenta\r\n"
		+ "5. Agregar beneficiario\r\n"
		+ "6. Salir";
		do {
			System.out.println("Menú cuenta bancaria" + s);
			opcion=leer.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese la cantidad que desea retirar");
				float monto= leer.nextFloat();
				cuenta_personal.retiros(monto);
				System.out.println("********************");
				break;
			case 2:
				System.out.println("Ingrese la cantidad que desea depositar");
				float deposito= leer.nextFloat();
				cuenta_personal.depositos(deposito);
				System.out.println("********************");
				break;
			case 3:
				System.out.println("Su saldo es: "+cuenta_personal.consultarSaldo());
				System.out.println("********************");
				break;
			case 4:
				System.out.println("El beneficiario de la cuenta es " +
						cuenta_personal.getBeneficiario());
				System.out.println("********************");
				break;
			case 5:
				System.out.println("Ingrese el nombre del beneficiario");
				String nombre=leer.nextLine();
				cuenta_personal.setBeneficiario(nombre);
				System.out.println("********************");
				break;
			}
		}while(opcion!=6);

		
	
	/*
		cuenta_personal.beneficiario="Carlos Eduardo";
		
		System.out.println("Ingresa un monto a depositar:");
		float deposito=leer.nextFloat();
		
		Sy1stem.out.println("Ingresa un monto a retirar:");
		float retiro=leer.nextFloat();
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		System.out.println("Tu saldo actual es "+ cuenta_personal.consultarSaldo());
		
		System.out.println(cuenta_personal.beneficiario);
		CuentaBancaria cuenta_papa = new CuentaBancaria();
		cuenta_papa.beneficiario="Rodolfo";
		System.out.println(cuenta_papa.beneficiario);
		*/
		leer.close();
	}

}
