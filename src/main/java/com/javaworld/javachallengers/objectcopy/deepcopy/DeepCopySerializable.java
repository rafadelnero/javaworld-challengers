package com.javaworld.javachallengers.objectcopy.deepcopy;

import com.javaworld.javachallengers.objectcopy.deepcopy.Category;
import com.javaworld.javachallengers.objectcopy.deepcopy.Product;

import java.io.*;

public class DeepCopySerializable {

  public static void main(String[] args) {
    try {
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      ObjectOutputStream out = new ObjectOutputStream(bos);

      Category category = new Category("Laptop", "Portable computers");
      Product product = new Product("Macbook Pro", 3000, category);
      out.writeObject(product);
      out.flush();
      out.close();

      ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
      ObjectInputStream in = new ObjectInputStream(bis);
      Product clonedProduct = (Product) in.readObject();
      in.close();

      System.out.println(clonedProduct.getName());
      Category clonedCategory = clonedProduct.getCategory();
      System.out.println(clonedCategory);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
