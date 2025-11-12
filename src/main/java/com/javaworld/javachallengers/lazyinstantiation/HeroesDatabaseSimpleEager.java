package com.javaworld.javachallengers.lazyinstantiation;

public class HeroesDatabaseSimpleEager {

  public static final HeroesDB heroesDB = new HeroesDB();

  static HeroesDB getHeroesDB() {
    return heroesDB;
  }

  static class HeroesDB {
    private HeroesDB() {
      System.out.println("Instantiating heroesDB eagerly...");
    }

    @Override
    public String toString() {
      return "HeroesDB instance";
    }
  }

  public static void main(String[] args) {
    System.out.println(HeroesDatabaseSimpleEager.getHeroesDB());
  }
}
