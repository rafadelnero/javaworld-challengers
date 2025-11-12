package com.javaworld.javachallengers.codereuse.solid;

import java.util.List;

class AreaCalculator {
  public static double calculateTotalArea(List<Shape> shapes) {
    double totalArea = 0.0;
    for (Shape shape : shapes) {
      totalArea += shape.area();
    }
    return totalArea;
  }
}

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    Rectangle rectangle = new Rectangle(4.0, 6.0);

    List<Shape> shapes = List.of(circle, rectangle);

    double totalArea = AreaCalculator.calculateTotalArea(shapes);
    System.out.println("Total area: " + totalArea);
  }
}