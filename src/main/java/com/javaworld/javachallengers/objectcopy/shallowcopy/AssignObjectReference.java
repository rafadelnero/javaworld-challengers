package com.javaworld.javachallengers.objectcopy.shallowcopy;

public class AssignObjectReference {

  public static void main(String[] args) {
    Product product = new Product("Macbook Pro", 3000);
    Product copyOfProduct = product;

    product.setName("Alienware");
    copyOfProduct.setName(product.getName());
    System.out.println(copyOfProduct.getName());
  }
}
