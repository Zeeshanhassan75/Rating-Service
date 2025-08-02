package com.microservices.ratingservice.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.ratingservice.Entity.Rating;
import com.microservices.ratingservice.Interface.RatingInterface;
import com.microservices.ratingservice.Repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingInterface {

	@Autowired
	RatingRepository ratingRepository;
	
	@Override
	public Rating makeRating(Rating rating) {
		Rating rate = new Rating();
		rate.setHotelId(rating.getHotelId());
		rate.setUserId(rating.getUserId());
		rate.setRating(rating.getRating());
		rate.setFeedback(rating.getFeedback());
		return ratingRepository.save(rate);
	}

	@Override
	public List<Rating> getRatingList() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> findByUserId(String userId) {
		return ratingRepository.findByUserId(userId) ;
	}

	@Override
	public List<Rating> findByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId) ;
	}

	@Override
	public Rating findByUserIdAndHotelId(String userId, String hotelId) {
		return ratingRepository.findByUserIdAndHotelId(userId, hotelId);
	}

}
