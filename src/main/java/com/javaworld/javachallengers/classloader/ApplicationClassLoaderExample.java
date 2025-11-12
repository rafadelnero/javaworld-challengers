package com.javaworld.javachallengers.classloader;

public class ApplicationClassLoaderExample {
    public static void main(String[] args) {
        // Get the Application Class Loader
        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        
        // Load a class using the Application Class Loader
        try {
            Class<?> clazz = appClassLoader.loadClass("java.util.ArrayList");
            System.out.println("Loaded class: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }

    }



    public  static <T extends String> void lol(T lol) {
        System.out.println();

    }
}
