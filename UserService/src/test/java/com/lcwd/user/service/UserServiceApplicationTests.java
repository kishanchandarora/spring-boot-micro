package com.lcwd.user.service;

import com.lcwd.user.service.entities.Rating;
import com.lcwd.user.service.external.services.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private RatingService ratingService;

	@Test
	void contextLoads() {
	}

//	@Test
//	void createRating() {
//		Rating rating = Rating.builder()
//				.rating(10)
//				.userId("c5440992-dded-4daa-9bdd-ab47c19e3d13")
//				.hotelId("a1c0fc64-ae25-4e5d-b680-d4e5d6146a4d")
//				.feedback("This is created using feign client")
//				.build();
//		ResponseEntity<Rating> entity = ratingService.createRating(rating);
//		entity.getBody();
//		System.out.println("New rating created !!");
//	}

}
