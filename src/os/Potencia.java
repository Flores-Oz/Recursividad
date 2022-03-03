package os;

import java.util.Scanner;

public class Potencia {
	
	 public Potencia() {}
	 
     public void PotenciaPower() {
    	 Scanner sn = new Scanner(System.in);
    	 System.out.println("Ingrese el Numero Base: ");
    	 long base = sn.nextLong();
    	 System.out.println("Ingrese el Numero Exponente: ");
         long exponente = sn.nextLong();
         System.out.println("Resultado: "+encontrarpotencia(base,exponente));
     }
     
     public long encontrarpotencia(long base, long exponente) {
    	 if(exponente == 0) return 1;
    	 return base * encontrarpotencia(base, exponente -1);
     }
}
