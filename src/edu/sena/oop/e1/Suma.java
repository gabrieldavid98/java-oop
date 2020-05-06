package edu.sena.oop.e1;

import java.util.Arrays;
import java.util.List;

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
}
