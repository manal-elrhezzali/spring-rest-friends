package com.wiredbrain.friends.services;

import com.wiredbrain.friends.models.Friend;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

//allow us to only test the data layer
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ServiceTests {

  @Autowired
  FriendService friendService;

  @Test
  public void testCreateReadDelete() {
    Friend friend = new Friend("Manal", "Rzzl");

    friendService.save(friend);

    Iterable<Friend> friends = friendService.findAll();
    Assertions.assertThat(friends).extracting(Friend::getFirstName).containsOnly("Manal");

    friendService.deleteAll();
    Assertions.assertThat(friendService.findAll()).isEmpty();
  }
}
