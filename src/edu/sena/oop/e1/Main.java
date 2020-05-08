package edu.sena.oop.e1;

public class Main {
   public static void main(String[] args) {
      System.out.println("Programa de sumas");

      Suma suma = new SumaBuilder().
         pedirDatosPorTeclado("Ingrese el primer numero a sumar: ").
         pedirDatosPorTeclado("Ingrese el segundo dato a sumar: ").
         agregarDato(500).
         construir();

      suma.calcular();

      System.out.printf("Resultado: %s", suma);
   }
}
