package com.wiredbrain.friends;

import com.wiredbrain.friends.controllers.FriendController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//means JUnit is used
@RunWith(SpringRunner.class)
//starts a Spring Boot app inside the test
@SpringBootTest
class FriendsApplicationTests {

	//Spring context  will instantiate the FriendController
	@Autowired
	FriendController friendController;

	//checks that the friendController isn't null
	@Test
	void contextLoads() {
		Assert.assertNotNull(friendController);
	}

}
