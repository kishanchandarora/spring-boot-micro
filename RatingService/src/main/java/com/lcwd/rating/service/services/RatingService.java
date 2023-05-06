package com.lcwd.rating.service.services;

import com.lcwd.rating.service.entities.Rating;

import java.util.List;

public interface RatingService {

    // create rating
    Rating createRating(Rating rating);

    // get all rating
    List<Rating> getAllRating();

    // get all rating by user
    List<Rating> getRatingsByUserId(String userId);

    // get all rating by hotel
    List<Rating> getRatingsByHotelId(String hotelId);
}
