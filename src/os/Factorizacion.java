package os;

import java.util.Scanner;

public class Factorizacion {
      public Factorizacion(){
    	  
      }
      
      public void FactorizacionPower(){
    	  Scanner sn = new Scanner(System.in);
    	  System.out.println("Ingrese el Numero a Factorizar");
    	  long factor = sn.nextLong();
    	  System.out.println("Resultado: " + encontrarFactorizacion(factor));
      }
      
      public long encontrarFactorizacion(long factor) {
    	  if(factor==1) return 1;
    	  return factor * encontrarFactorizacion(factor -1);
      }
}
