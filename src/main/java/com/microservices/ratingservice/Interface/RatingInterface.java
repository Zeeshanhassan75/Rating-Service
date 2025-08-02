package com.microservices.ratingservice.Interface;

import java.util.List;

import com.microservices.ratingservice.Entity.Rating;

public interface RatingInterface {
	
	Rating makeRating(Rating rating);
	
	List<Rating> getRatingList();
	
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);
	
	Rating findByUserIdAndHotelId(String userId, String hotelId);
	
}
