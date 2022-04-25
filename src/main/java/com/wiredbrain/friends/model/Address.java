package com.wiredbrain.friends.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Embeddable

//now the address is a real entity
@Entity
public class Address {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;
  private String street;
  private String city;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
