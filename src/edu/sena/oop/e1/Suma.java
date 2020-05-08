package edu.sena.oop.e1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Suma {
   private List<Integer> nums;
   private int result;

   public Suma(Integer... nums) {
      this.nums = Arrays.asList(nums);
   }

   public Suma calcular() {
      result = nums.stream().reduce(0, Integer::sum);
      return this;
   }

   public int getResult() {
      return result;
   }

   @Override
   public String toString() {
      final String stringSuma = nums.
         stream().
         map(String::valueOf).
         collect(Collectors.joining(" + "));

      final String operacion = String.format("%s = %d", stringSuma, result);

      return operacion;
   }
}
