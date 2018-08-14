package com.javaworld.javachallengers.equalshashcode;

public class EqualsHashCodeChallenge {

  static int i = 0;

  public static void main(String... doYourBest) {
    System.out.println(new Simpson("Bart").equals(new Simpson("Bart")));

    System.out.println(new Simpson("Homer").equals(new Simpson("Homer") {
      @Override
      public int hashCode() {
        return name.hashCode() + (43 + 777) + i;
      }
    }));
  }

  static class Simpson {
    String name;
    Simpson(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
      Simpson otherSimpson = (Simpson) obj;
      return this.name.equals(otherSimpson.name) &&
          this.hashCode() == otherSimpson.hashCode();
    }

    @Override
    public int hashCode() {
      return name.hashCode() + (43 + 777) + (--i);
    }
  }

}
