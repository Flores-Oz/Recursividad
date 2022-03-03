package os;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcionMenu = 0;
		do {
			System.out.println("\n |-------------------------------------|");
			System.out.println(" |   ° CONCEPTO DE RECURSIVIDAD °        |");
			System.out.println(" |------------------|------------------|");
			System.out.println(" | 1. Potencia      | 4. Salir         |");
			System.out.println(" | 2. Factorizacion |                  |");
			System.out.println(" | 3. Fibonacci     |                  |");
			System.out.println(" |------------------|------------------|");
			System.out.print(" Escoja una Opción: ");
			opcionMenu = teclado.nextInt();
			switch (opcionMenu) {
			case 1:
				System.out.println("\n\n Potencia \n");
		        Potencia p = new Potencia();
		        p.PotenciaPower();
				break;
			case 2:
				System.out.println("\n\n Factorizacion \n");
				Factorizacion f = new Factorizacion();
				f.FactorizacionPower();
				break;
			case 3:
				System.out.println("\n\n Fibonacci \n");
                Fibonacci g = new Fibonacci();
                g.FibonacciP();
				break;
			case 4:
				System.out.println("\n\n Programa finalizado... \n");
				break;
			default:
				System.out.println("\n\n Opcion No Valida \n");
				System.exit(0);
				break;
			}
		} while (opcionMenu != 4);
	}
}
