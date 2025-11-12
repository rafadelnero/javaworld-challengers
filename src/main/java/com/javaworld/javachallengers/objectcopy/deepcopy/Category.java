package com.javaworld.javachallengers.objectcopy.deepcopy;

import java.io.Serializable;

public class Category implements Serializable, Cloneable {

  private String name;
  private String description;

  public Category(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() { return name;}
  public String getDescription() { return description; }

  public void setName(String name) { this.name = name; }
  public void setDescription(String description) { this.description = description; }

  @Override
  public String toString() {
    return "Category{" + "name='" + name + '\'' + ", description='" + description + '\'' + '}';
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
