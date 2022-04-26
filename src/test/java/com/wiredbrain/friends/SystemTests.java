package com.wiredbrain.friends;

import com.wiredbrain.friends.models.Friend;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SystemTests {

  @Test
  public void testCreateReadDelete() {
    RestTemplate restTemplate = new RestTemplate();

    String url = "http://localhost:8080/friend";

    Friend friend = new Friend("Manal", "EL RHEZZALI");
    ResponseEntity<Friend> entity = restTemplate.postForEntity(url, friend, Friend.class);

    Friend[] friends = restTemplate.getForObject(url, Friend[].class);
    Assertions.assertThat(friends).extracting(Friend::getFirstName).containsOnly("Manal");

    restTemplate.delete(url + "/" + entity.getBody().getId());
    Assertions.assertThat(restTemplate.getForObject(url, Friend[].class)).isEmpty();
  }
}
