package com.wiredbrain.friends.controller;

import com.wiredbrain.friends.model.Friend;
import com.wiredbrain.friends.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
}
