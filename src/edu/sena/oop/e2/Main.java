package edu.sena.oop.e2;

public class Main {
   public static void main(String[] args) {
      NominaApp app = new NominaApp().
         ingresarNumeroEmpleados().
         ingresarEmpleados();

      app.liquidarNomina();
   }
}
