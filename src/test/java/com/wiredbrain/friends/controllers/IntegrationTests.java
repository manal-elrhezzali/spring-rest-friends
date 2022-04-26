package com.wiredbrain.friends.controllers;

import com.wiredbrain.friends.models.Friend;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationTests {

  @Autowired
  FriendController friendController;

  @Test
  public void testCreateReadDelete() {
    Friend friend = new Friend("Manal", "Rzzl");

    Friend friendResult = friendController.create(friend);

    Iterable<Friend> friends = friendController.read();
    Assertions.assertThat(friends).first().hasFieldOrPropertyWithValue("firstName", "Manal");

    friendController.delete(friendResult.getId());
    Assertions.assertThat(friendController.read()).isEmpty();

  }
}
