package com.javaworld.javachallengers.objectcopy.shallowcopy;

import java.io.Serializable;

public class Product implements Serializable, Cloneable {

  private String name;
  private double price;
  private Category category;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
    this.category = category;
  }

  public Product(String name, double price, Category category) {
    this.name = name;
    this.price = price;
    this.category = category;
  }

  public Category getCategory() { return category; }
  public String getName() { return name; }
  public double getPrice() { return price; }

  public void setName(String name) { this.name = name; }
  public void setPrice(double price) { this.price = price; }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
