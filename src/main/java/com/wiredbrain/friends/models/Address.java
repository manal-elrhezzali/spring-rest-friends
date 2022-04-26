package com.wiredbrain.friends.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

//@Embeddable

//now the address is a real entity
@Entity
public class Address {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;
  private String street;
  private String city;

  //friend back reference
  @ManyToOne
  private Friend friend;

  public Friend getFriend() {
    return friend;
  }

  public void setFriend(Friend friend) {
    this.friend = friend;
  }

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
