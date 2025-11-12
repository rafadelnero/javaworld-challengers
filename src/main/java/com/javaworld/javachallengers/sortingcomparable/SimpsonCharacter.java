package com.javaworld.javachallengers.sortingcomparable;

class SimpsonCharacter implements Comparable<SimpsonCharacter> {
    String name;

    SimpsonCharacter(String name) {
        this.name = name;
    }

    public int compareTo(SimpsonCharacter simpson) {
        return this.name.compareTo(simpson.name);
    }

    public String toString() {
        return this.name;
    }


}