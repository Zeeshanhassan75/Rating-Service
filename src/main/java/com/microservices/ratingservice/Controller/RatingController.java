package com.microservices.ratingservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.ratingservice.Entity.Rating;
import com.microservices.ratingservice.Interface.RatingInterface;

@RequestMapping("/ratingService")
@RestController
public class RatingController {
	
	@Autowired
	RatingInterface ratingInterface;
	
	@PostMapping("/makeHotelRating")
	ResponseEntity<Rating> makeRating(@RequestBody Rating rating){
		Rating rate =  ratingInterface.makeRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(rate);
	}
	
	@GetMapping("/getRatingsByUserId/{userId}")
	ResponseEntity <List<Rating>> getRatingByUserId(@PathVariable String userId){
		List<Rating> rate = ratingInterface.findByUserId(userId);
		return ResponseEntity.ok(rate);
	}
	
	@GetMapping("/getRatingsByHotelId/{hotelId}")
	ResponseEntity <List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		List<Rating> rate = ratingInterface.findByHotelId(hotelId);
		return ResponseEntity.ok(rate);
	}
	
	@GetMapping("/getHotelRatingByUserId/{hotelId}/{userId}")
	ResponseEntity <Rating> getHotelRatingByUserId(@PathVariable String hotelId, @PathVariable String userId){
		Rating rate = ratingInterface.findByUserIdAndHotelId(userId, hotelId);
		return ResponseEntity.ok(rate);
	}
	
	@GetMapping("/getAllRatings")
	ResponseEntity <List<Rating>> getAllRatings(){
		List<Rating> rate = ratingInterface.getRatingList();
		return ResponseEntity.ok(rate);
	}
	
	
	
}
