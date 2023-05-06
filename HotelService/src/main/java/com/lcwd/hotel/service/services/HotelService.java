package com.lcwd.hotel.service.services;

import com.lcwd.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {

    // create hotel
    Hotel createHotel(Hotel hotel);

    // get all hotel
    List<Hotel> getAllHotel();

    // get single hotel
    Hotel getSingleHotel(String hotelId);
}
