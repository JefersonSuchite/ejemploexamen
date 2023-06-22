package ejemplospoo;
//import java.util.Scanner; //importando la clase scanner, para que la funcion lea lo ingresado por el usuario

public class Ejemplospoo {
@SuppressWarnings("UnusedAssignment") //sirve para que no de alerta si alguna variable no es llamada
   public static void main(String[] args) {
      
      ejemplosExamen interfaz = new ejemplosExamen();
      
      interfaz.setVisible(true);
      interfaz.setLocationRelativeTo(null);
      
      /*
      Scanner sc = new Scanner(System.in); // hereda la funcion de la clase scanner, para leer datos ingresados por el usuario    
     // Calculadora cal = new Calculadora("Fast", 12.3); //llamamos a la clase calculadora para usar sus funciones   
      CalculadoraEspecial ce = new CalculadoraEspecial("casio", 1222223.123);
      
      double num1, num2, num3; //double = numeros con decimales 2.232. int = numeros enteros 1,2,3,4...
      
      System.out.println("Hola, Soy tu asistente.\nPor favor, Ingrese el Primer Numero.");
      num1=sc.nextInt();  // nextInt(); leera lo que el usuario escribió y lo guardara en la variable num1
      
      System.out.println("Por Favor, Ingrese el Segundo Numero: ");
      num2=sc.nextInt();
      
      System.out.println("Los Numeros que Ingreso el Usuario son: " + num1 + " y " + num2);
     //suma=num1+num2; //darle a la variabe resultado una funcion de suma, para que al momento de ser llamada, me de como resultado la suma
      System.out.println("La suma de los Numeros es: " + ce.sumar(num1, num2));
      
      System.out.println("Ingrese un tercer numero para restarlo con el resultado de la suma");
      num3=sc.nextInt();
      
      System.out.println("La resta de los numeros es: " + ce.resta(ce.sumar(num1, num2), num3));
      
      System.out.println("La multiplicacion de los Numeros Ingresados es : "  + ce.multiplicar(num1, num2));
      */
      
   }
   
}
