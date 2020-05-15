package edu.sena.oop.e2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NominaApp {
   private int numEmpleados;
   private List<Empleado> empleadosNomina;
   private Scanner scanner;

   public NominaApp() {
      empleadosNomina = new ArrayList<>();
      scanner = new Scanner(System.in);
   }

   public NominaApp ingresarNumeroEmpleados() {
      System.out.print("Ingrese el numero de empleados para la nomina: ");
      numEmpleados = scanner.nextInt();
      scanner.nextLine();
      return this;
   }

   public NominaApp ingresarEmpleados() {
      for(int i = 0; i < numEmpleados; i++) {
         System.out.println("Ingrese el empleado");

         System.out.print("Ingrese el nombre del empleado: ");
         final String nombre = scanner.nextLine();

         System.out.print("Ingrese el salario del empleado: ");
         final double salario = scanner.nextDouble();
         scanner.nextLine();

         System.out.print("Ingrese la cantidad de horas extras: ");
         final byte cantidadHorasExtra = scanner.nextByte();
         scanner.nextLine();

         System.out.print("Ingrese el valor de las horas extras: ");
         final double valorHorasExtras = scanner.nextDouble();
         scanner.nextLine();

         System.out.print("Ingrese la comisión del empleado: ");
         final double comision = scanner.nextDouble();
         scanner.nextLine();

         Empleado empleado = new Empleado();
         empleado.setNombre(nombre);
         empleado.setSalario(salario);
         empleado.setCantidadHorasExtra(cantidadHorasExtra);
         empleado.setValorHorasExtras(valorHorasExtras);
         empleado.setNetoAPagar(calcularNetoAPagar(empleado));

         empleadosNomina.add(empleado);
      }

      return this;
   }

   public void liquidarNomina() {
      empleadosNomina.forEach(System.out::print);
      final double nominaTotal = empleadosNomina.
         stream().
         mapToDouble(e -> e.getNetoAPagar()).
         reduce(0, Double::sum);

      System.out.printf("Valor total de nomina: $%,.2f", nominaTotal);
   }

   private double calcularNetoAPagar(Empleado empleado) {
      final double valorTotalHorasExtras =
         empleado.getCantidadHorasExtra() * empleado.getValorHorasExtras();

      final double netoAPagar =
         empleado.getSalario() +
         empleado.getComision() +
         valorTotalHorasExtras;

      return netoAPagar;
   }
}
