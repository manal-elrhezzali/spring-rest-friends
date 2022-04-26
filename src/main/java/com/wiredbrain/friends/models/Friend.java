package com.wiredbrain.friends.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
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
//  @JsonProperty("first-name")
  private String firstName;
//  @JsonProperty("last-name")
  private String lastName;

  //mapped by friend from the other side
  @OneToMany(mappedBy= "friend", cascade = CascadeType.ALL)
  private Set<Address> addresses;

  public Set<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(Set<Address> addresses) {
    this.addresses = addresses;
  }


//  int age;
//  @JsonIgnore
//  boolean married;

//  @OneToMany(cascade = CascadeType.ALL)
//  List<Address> addresses;
//
//  public List<Address> getAddresses() {
//    return addresses;
//  }
//
//  public void setAddresses(List<Address> addresses) {
//    this.addresses = addresses;
//  }

//  @Embedded
//  Address address;

//  public Address getAddress() {
//    return address;
//  }
//
//  public void setAddress(Address address) {
//    this.address = address;
//  }


  public Friend() {
  }

  public Friend(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

//  public int getAge() {
//    return age;
//  }
//
//  public void setAge(int age) {
//    this.age = age;
//  }
//
//  public boolean isMarried() {
//    return married;
//  }
//
//  public void setMarried(boolean married) {
//    this.married = married;
//  }

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
