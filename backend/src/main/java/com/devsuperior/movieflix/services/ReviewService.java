package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import com.devsuperior.movieflix.repositories.UserRepository;

@Service
public class ReviewService {
	
	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ReviewRepository reviewRepository;

	public ReviewDTO insert(ReviewDTO dto) {
		Review entity = new Review();
		entity.setMovie(movieRepository.getOne(dto.getMovieId()));
		entity.setText(dto.getText());
		entity.setUser(userRepository.getOne(dto.getUserId()));
		entity = reviewRepository.save(entity);
		return new ReviewDTO(entity);
	}
}
