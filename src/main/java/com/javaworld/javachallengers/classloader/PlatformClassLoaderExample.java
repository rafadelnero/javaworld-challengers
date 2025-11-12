package com.javaworld.javachallengers.classloader;

public class PlatformClassLoaderExample {
    public static void main(String[] args) {
        ClassLoader platformClassLoader = ClassLoader.getPlatformClassLoader();
        System.out.println("Platform Class Loader: " + platformClassLoader);
        System.out.println("Parent Class Loader: " + platformClassLoader.getParent());
        // Try to load a class from the Platform Class Loader
        try {
            Class<?> jmxClass = Class.forName("javax.management.MBeanServerDelegate",
                true, platformClassLoader);
            System.out.println("JMX class loaded by: " + jmxClass.getClassLoader());
        } catch (ClassNotFoundException e) {
            System.out.println("JMX class not found");
        }
    }
}
