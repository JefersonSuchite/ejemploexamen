
package ejemplospoo;

public class Calculadora {
   
   //atributos 
   public String nombreCalculadora; //String = variable de texto //public, puede ser visible y modificable
   protected double serie; //double = numeros con decimales  // protected, puede ser visible pero no modificable
  
   //crear un constructor, sirve para ser llamado a otras clases o al principal
   public Calculadora(String nombreCalculadora, double serie) {
      this.nombreCalculadora = nombreCalculadora;
      this.serie = serie;
   }
   
   //getter and setter. //get = traer. set = enviar
   public String getNombreCalculadora() {
      return nombreCalculadora;
   }

   public void setNombreCalculadora(String nombreCalculadora) {
      this.nombreCalculadora = nombreCalculadora;
   }

   public double getSerie() {
      return serie;
   }

   public void setSerie(double serie) {
      this.serie = serie;
   }
   
   //funciones 
   public double sumar(double num1, double num2, double num3){
   return num1+num2+num3;
   }
   
   public double resta(double num1, double num2){
   return num1-num2;
   }
   
}
