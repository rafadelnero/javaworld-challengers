package com.javaworld.javachallengers.objectcopy.shallowcopy;

public class ShallowCopyWithCopyMethod {
  public static void main(String[] args) throws CloneNotSupportedException {
    Product product = new Product("Macbook Pro", 3000);
    Product copyOfProduct = (Product) product.clone();

    product.setName("Alienware");
    System.out.println(product.getName());
    System.out.println(copyOfProduct.getName());
  }
}
