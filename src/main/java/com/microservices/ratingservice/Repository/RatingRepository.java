package com.microservices.ratingservice.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservices.ratingservice.Entity.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {
		
	//rating based on userId
	List<Rating> findByUserId(String userId);
	
	//rating based on HotelId
	List<Rating> findByHotelId(String hotelId);
	
	//Hotel rating based on userId
	Rating findByUserIdAndHotelId(String userId, String hotelId);
	
}
