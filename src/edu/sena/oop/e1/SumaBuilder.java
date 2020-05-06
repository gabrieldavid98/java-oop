package edu.sena.oop.e1;

import java.util.ArrayList;
import java.util.List;

public class SumaBuilder {
   public Suma build() {
      List<Integer> a = new ArrayList<>();
      a.add(10);
      new Suma(a.toArray(Integer[]::new));
      return null;
   }
}
