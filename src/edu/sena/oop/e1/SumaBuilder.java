package edu.sena.oop.e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaBuilder {

   private List<Integer> nums;
   private Scanner scanner;

   public SumaBuilder() {
      nums = new ArrayList<>();
      scanner = new Scanner(System.in);
   }

   public SumaBuilder pedirDatosPorTeclado(String instruccion) {
      System.out.print(instruccion);
      final int num = scanner.nextInt();
      scanner.nextLine();

      nums.add(num);

      return this;
   }

   public SumaBuilder agregarDato(int num) {
      nums.add(num);

      return this;
   }

   public Suma construir() {
      return new Suma(nums.toArray(new Integer[nums.size()]));
   }
}
