
package Ejercicio3PrimeraParte;

public class Ejercicio3 {
    
    public static int suma(int a, int b, int c){
       return a+b+c;
   }
  
    public static class Coche {
        public int puertas = 4;
        public void AgregarPuerta(){
            this.puertas ++;
        } 
}
     public static void main(String[] args) {
        int resultado = suma(1,2,3);
        System.out.println(resultado);    
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("miCoche tiene " + miCoche.puertas + " puertas");    
    } 
}
