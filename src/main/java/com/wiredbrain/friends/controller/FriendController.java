package com.wiredbrain.friends.controller;

import com.wiredbrain.friends.model.Friend;
import com.wiredbrain.friends.service.FriendService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {

  @Autowired
  FriendService friendService;

  @PostMapping("/friend")
  public Friend create(@RequestBody Friend friend) {
    return friendService.save(friend);
  }

  @PutMapping("/friend")
  public Friend update(@RequestBody Friend friend) {
    return friendService.save(friend);
  }

  @GetMapping("/friend")
  Iterable<Friend> read() {
    return friendService.findAll();
  }

  @DeleteMapping("/friend/{id}")
  public void delete(@PathVariable Integer id) {
    friendService.deleteById(id);
  }

  @GetMapping("/friend/{id}")
  public Optional<Friend> findById(@PathVariable Integer id) {
    return friendService.findById(id);
  }

  @GetMapping("/friend/search")
  Iterable<Friend> findByQuery(@RequestParam(value = "first", required = false) String firstName,
      @RequestParam(value = "last", required = false) String lastName) {
    if(firstName != null && lastName != null) {
      return friendService.findByFirstNameAndLastName(firstName, lastName);
    } else if(firstName != null) {
      return friendService.findByFirstName(firstName);
    } else if(lastName != null) {
      return friendService.findByLastName(lastName);
    } else {
      return friendService.findAll();
    }
  }
}
