package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.devsuperior.movieflix.entities.Review;


public class ReviewDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long id;
    @NotBlank(message = "O campo text não pode ser vazio ou nullo.")
    @NotNull(message = "O campo text não pode ser vazio ou nullo.")
    private String text;
    private Long movieId;
    private UserDTO user;
    

    public ReviewDTO() {
    }

    public ReviewDTO(Long id, String text, Long movieId, UserDTO user) {
        this.id = id;
        this.text = text;
        this.user = user;
    }
    
    public ReviewDTO(Review entity) {
    	this.id = entity.getId();
        this.text = entity.getText(); 
        this.movieId = entity.getMovie().getId();
        this.user = new UserDTO(entity.getUser());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
    
	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReviewDTO)) return false;
        ReviewDTO review = (ReviewDTO) o;
        return id.equals(review.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
