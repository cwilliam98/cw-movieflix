package com.devsuperior.movieflix.dto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


public class ReviewDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long id;
    private String text;
    private Long movieId;

    public ReviewDTO() {
    }

    public ReviewDTO(Long id, String text, Long movieId) {
        this.id = id;
        this.text = text;
        this.movieId = movieId;
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
