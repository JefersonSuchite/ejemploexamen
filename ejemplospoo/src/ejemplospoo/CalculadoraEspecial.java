
package ejemplospoo;

public class CalculadoraEspecial extends Calculadora {

   public CalculadoraEspecial(String nombreCalculadora, double serie) {
      super(nombreCalculadora, serie);
   }

  public double multiplicar(double num1, double num2){
  return num1*num2;
  }
   
}
