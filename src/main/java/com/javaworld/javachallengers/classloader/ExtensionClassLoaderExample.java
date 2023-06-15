package com.javaworld.javachallengers.classloader;

public class ExtensionClassLoaderExample {
    public static void main(String[] args) {
        // javax.swing.JFrame class is loaded by the Extension Class Loader
        ClassLoader loader = javax.swing.JFrame.class.getClassLoader();
        System.out.println("Class loader for JFrame class: " + loader);

        // org.xml.sax.helpers.DefaultHandler class is also loaded by the Extension Class Loader
        ClassLoader loader2 = org.xml.sax.helpers.DefaultHandler.class.getClassLoader();
        System.out.println("Class loader for DefaultHandler class: " + loader2);
    }
}
