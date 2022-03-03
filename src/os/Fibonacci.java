package os;

import java.util.Scanner;

public class Fibonacci {
     public Fibonacci() {}
     
     public void FibonacciP() {
    	 Scanner sn = new Scanner(System.in);
    	 System.out.println("Ingrese el limite de la serie fibonacci");
    	 long limite = sn.nextLong();
    	 System.out.println("Los Primeros "+limite+" de la serie Fibonacci son");
    	 FibonacciR(limite,0,1);
     }
     
     public void FibonacciR(long limite, long anterior, long actual) {
    	 if (limite > 0 ) {
    		 System.out.println(""+actual);
    		 FibonacciR(limite -1,actual,anterior+actual);
    	 }
     }
}
