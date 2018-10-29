package org.ua.spring.tacos.tacoscloud;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.immutables.value.Value;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Value.Modifiable
@Value.Style(of = "new", beanFriendlyModifiables = true, create = "new")
public abstract class Order {
  @Value.Parameter
  public abstract String getName();

  @NotBlank(message = "Name is required")
  public abstract void setName(String name);

  @Value.Parameter
  public abstract String getStreet();

  @NotBlank(message = "Street is required")
  public abstract void setStreet(String street);

  @Value.Parameter
  public abstract String getCity();

  @NotBlank(message = "City is required")
  public abstract void setCity(String city);

  @Value.Parameter
  public abstract String getState();

  public abstract void setState(@NotBlank(message = "State is required") String state);

  @Value.Parameter
  public abstract String getZip();

  public abstract void setZip(@NotBlank(message = "Zip code is required") String zip);

  @Value.Parameter
  public abstract String getCcNumber();

  public abstract void setCcNumber(@CreditCardNumber(message = "Not a valid credit card number") String ccNumber);

  @Value.Parameter
  public abstract String getCcExpiration();

  public abstract void setCcExpiration(@Pattern(regexp = "^(0[1-9]|1[0-2])([/])([1-9][0-9])$", message = "Must be formatted MM/YY") String ccExpiration);

  @Value.Parameter
  public abstract String getCcCVV();

  public abstract void setCcCVV(@Digits(integer = 3, fraction = 0, message = "Invalid CVV") String ccCVV);

//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public String getStreet() {
//    return street;
//  }
//
//  public void setStreet(String street) {
//    this.street = street;
//  }
//
//  public String getCity() {
//    return city;
//  }
//
//  public void setCity(String city) {
//    this.city = city;
//  }
//
//  public String getState() {
//    return state;
//  }
//
//  public void setState(String state) {
//    this.state = state;
//  }
//
//  public String getZip() {
//    return zip;
//  }
//
//  public void setZip(String zip) {
//    this.zip = zip;
//  }
//
//  public String getCcNumber() {
//    return ccNumber;
//  }
//
//  public void setCcNumber(String ccNumber) {
//    this.ccNumber = ccNumber;
//  }
//
//  public String getCcExpiration() {
//    return ccExpiration;
//  }
//
//  public void setCcExpiration(String ccExpiration) {
//    this.ccExpiration = ccExpiration;
//  }
//
//  public String getCcCVV() {
//    return ccCVV;
//  }
//
//  public void setCcCVV(String ccCVV) {
//    this.ccCVV = ccCVV;
//  }

//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//    Order order = (Order) o;
//    return Objects.equals(getName(), order.getName()) &&
//        Objects.equals(getStreet(), order.getStreet()) &&
//        Objects.equals(getCity(), order.getCity()) &&
//        Objects.equals(getState(), order.getState()) &&
//        Objects.equals(getZip(), order.getZip()) &&
//        Objects.equals(getCcNumber(), order.getCcNumber()) &&
//        Objects.equals(getCcExpiration(), order.getCcExpiration()) &&
//        Objects.equals(getCcCVV(), order.getCcCVV());
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(
//        getName(),
//        getStreet(),
//        getCity(),
//        getState(),
//        getZip(),
//        getCcNumber(),
//        getCcExpiration(),
//        getCcCVV()
//    );
//  }
//
//  @Override
//  public String toString() {
//    return "Order{" +
//        "name='" + name + '\'' +
//        ", street='" + street + '\'' +
//        ", city='" + city + '\'' +
//        ", state='" + state + '\'' +
//        ", zip='" + zip + '\'' +
//        ", ccNumber='" + ccNumber + '\'' +
//        ", ccExpiration='" + ccExpiration + '\'' +
//        ", ccCVV='" + ccCVV + '\'' +
//        '}';
//  }
}
