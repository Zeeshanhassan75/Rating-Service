package com.microservices.ratingservice.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("RATING_SERVICE")
public class Rating {
	
	@Id
	@Field(name = "RATING_ID")
	private String ratingId;
	
	@Field(name = "HOTEL_ID")
	private String hotelId;
	
	@Field(name = "USER_ID")
	private String userId;
	
	@Field(name = "FEEDBACK")
	private String Feedback;
	
	@Field(name = "RATING")
	private int rating;

}
