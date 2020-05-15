package edu.sena.oop.e2;

public class Empleado {
   private String nombre;
   private double salario;
   private byte cantidadHorasExtra;
   private double valorHorasExtras;
   private double comision;
   private double netoAPagar;

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public double getSalario() {
      return salario;
   }

   public void setSalario(double salario) {
      this.salario = salario;
   }

   public double getValorHorasExtras() {
      return valorHorasExtras;
   }

   public void setValorHorasExtras(double valorHorasExtras) {
      this.valorHorasExtras = valorHorasExtras;
   }

   public double getComision() {
      return comision;
   }

   public void setComision(double comision) {
      this.comision = comision;
   }

   public double getNetoAPagar() {
      return netoAPagar;
   }

   public void setNetoAPagar(double netoAPagar) {
      this.netoAPagar = netoAPagar;
   }

   public byte getCantidadHorasExtra() {
      return cantidadHorasExtra;
   }

   public void setCantidadHorasExtra(byte cantidadHorasExtra) {
      this.cantidadHorasExtra = cantidadHorasExtra;
   }

   @Override
   public String toString() {
      return new StringBuilder().
         append("======================\n").
         append(String.format("Nombre: %s \n", nombre.toUpperCase())).
         append(String.format("Neto a pagar: $%,.2f \n", netoAPagar)).
         append("======================\n").
         toString();
   }
}
