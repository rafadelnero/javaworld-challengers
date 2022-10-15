package com.javaworld.javachallengers.lazyinstantiation;


public class ThreadSafeSynchronized {

  public static HeroesDB heroesDB;

  public static HeroesDB getHeroesDB() {
    if(heroesDB == null) {
      synchronized (ThreadSafeSynchronized.class) {
        if(heroesDB == null) {
          heroesDB = new HeroesDB();
        }
      }
    }
    return heroesDB;
  }

  static class HeroesDB { }
}
