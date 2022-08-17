package com.javaworld.javachallengers.lazyinstantiation;

public class SingletonSynchronizedApproach {

  public static HeroesDB heroesDB;
  private SingletonSynchronizedApproach() {}

  synchronized HeroesDB getHeroesDB() {
    if (heroesDB == null) {
      heroesDB = new HeroesDB();
    }

    return heroesDB;
  }

  static class HeroesDB { }

}
