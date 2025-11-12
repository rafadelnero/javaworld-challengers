package com.javaworld.javachallengers.lazyinstantiation;

public class SingletonNaiveApproach {

  public static HeroesDB heroesDB;
  private SingletonNaiveApproach() {}

  HeroesDB getHeroesDB() {
    if (heroesDB == null) {
      heroesDB = new HeroesDB();
    }

    return heroesDB;
  }

  static class HeroesDB { }

}
