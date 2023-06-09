package com.lcwd.rating.service.repositories;

import com.lcwd.rating.service.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {

    // custom find methods
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
