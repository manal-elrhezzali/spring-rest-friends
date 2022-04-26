package com.wiredbrain.friends.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Friend {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;
  @NotBlank
  @JsonProperty("first-name")
  private String firstName;
  @JsonProperty("last-name")
  private String lastName;
  int age;
  @JsonIgnore
  boolean married;

  @OneToMany(cascade = CascadeType.ALL)
  List<Address> addresses;

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

//  @Embedded
//  Address address;

//  public Address getAddress() {
//    return address;
//  }
//
//  public void setAddress(Address address) {
//    this.address = address;
//  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isMarried() {
    return married;
  }

  public void setMarried(boolean married) {
    this.married = married;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
