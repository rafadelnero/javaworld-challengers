package com.javaworld.javachallengers.objectcopy.shallowcopy;

public class TryDeepCopyWithClone {

  public static void main(String[] args) throws CloneNotSupportedException {
    Category category = new Category("Laptop", "Portable computers");
    Product product = new Product("Macbook Pro", 3000, category);
    Product copyOfProduct = (Product) product.clone();

    Category copiedCategory = copyOfProduct.getCategory();

    System.out.println(copiedCategory.getName());
    copiedCategory.setName("Phone");
    System.out.println(copiedCategory.getName());
    System.out.println(category.getName());
  }
}
