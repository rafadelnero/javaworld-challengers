package com.javaworld.javachallengers.hashcode;

import java.util.Objects;

public class HashcodeConcept {

    public static void main(String... hashcodeExample) {
        Simpson homer = new Simpson(1, "Homer", 35);
        Simpson bart = new Simpson(2, "Homer", 35);

        boolean isHashcodeEquals = homer.hashCode() == bart.hashCode();

        if (isHashcodeEquals) {
            homer.equals(bart);
        } else {
            System.out.println("Objects are not equals.");
        }
    }

    static class Simpson {
        int id;
        String name;
        int age;

        public Simpson(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Simpson simpson = (Simpson) o;
            return id == simpson.id &&
                    age == simpson.age &&
                    Objects.equals(name, simpson.name);
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

}
