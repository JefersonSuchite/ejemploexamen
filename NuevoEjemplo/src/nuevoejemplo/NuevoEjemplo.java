package nuevoejemplo;

import java.util.Scanner;

public class NuevoEjemplo {
@SuppressWarnings("UnusedAssignment")
   public static void main(String[] args) {
      double num1,num2,resultado;
      Scanner sn = new Scanner(System.in);
      
      System.out.println("Hola, Soy Un Asistente Virtual.\nPor Favor Ingrese Un Numero");
      num1=sn.nextDouble();
      
      System.out.println("Ingrese el Seggundo Numero");
      num2=sn.nextDouble();
      
      System.out.println("Los datos ingresados por el usuario son: "+num1+" y "+num2);
   }
   
}
