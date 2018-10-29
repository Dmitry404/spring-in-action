package org.ua.spring.tacos.tacoscloud;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Taco {
  @NotNull
  @Size(min = 5, message = "Name must be at least 5 characters long")
  private String name;
  @NotNull
  @Size(min = 1, message = "You must choose at least 1 ingredient")
  private List<String> ingredients;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object != null && getClass().equals(object.getClass())) {
      Taco taco = (Taco) object;
      return Objects.equals(getName(), taco.getName()) &&
          Objects.equals(getIngredients(), taco.getIngredients());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getIngredients());
  }

  @Override
  public String toString() {
    return "Taco{" +
        "name='" + name + '\'' +
        ", ingredients=" + ingredients +
        '}';
  }
}
