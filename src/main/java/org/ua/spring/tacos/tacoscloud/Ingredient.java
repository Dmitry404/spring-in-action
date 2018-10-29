package org.ua.spring.tacos.tacoscloud;

import java.util.Objects;

public class Ingredient {
  private final String id;
  private final String name;
  private final Type type;

  public Ingredient(String id, String name, Type type) {
    this.id = id;
    this.name = name;
    this.type = type;
  }

  public String key() {
    return getType().toString().toLowerCase();
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Type getType() {
    return type;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object != null && getClass().equals(object.getClass())) {
      Ingredient that = (Ingredient) object;
      return Objects.equals(getId(), that.getId()) &&
          Objects.equals(getName(), that.getName()) &&
          getType() == that.getType();
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName(), getType());
  }

  enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

  @Override
  public String toString() {
    return "Ingredient{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", type=" + type +
        '}';
  }
}
