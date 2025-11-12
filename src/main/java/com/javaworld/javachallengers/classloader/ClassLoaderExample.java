package com.javaworld.javachallengers.classloader;

public class ClassLoaderExample {
  public static void main(String[] args) throws ClassNotFoundException {
    // Get the system class loader
    ClassLoader classLoader = ClassLoader.getSystemClassLoader();

    // Load the String class
    Class<?> stringClass = classLoader.loadClass("java.lang.String");

    // Print the class name
    System.out.println("Loaded class: " + stringClass.getName());
  }
}
