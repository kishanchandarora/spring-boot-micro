package com.lcwd.user.service.external.services;

import com.lcwd.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

    // get rating

    // create rating
    @PostMapping("/ratings")
    ResponseEntity<Rating> createRating(@RequestBody Rating rating);

    // update rating
    @PutMapping("/ratings/{ratingId}")
    ResponseEntity<Rating> updateRating(@PathVariable String ratingId, @RequestBody Rating rating);

    // delete rating
    @DeleteMapping("/ratings/{ratingId}")
    void deleteRating(@PathVariable String ratingId) ;
}
