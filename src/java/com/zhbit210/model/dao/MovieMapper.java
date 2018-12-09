package com.zhbit210.model.dao;

import com.zhbit210.model.pojo.Movie;

import java.util.List;

public interface MovieMapper {
    Movie selectMovieById(int movieId);

    List<Movie> selectAllMovie();

    List<Movie> selectMovieByHallId(int hallId);

    List<Movie> selectMovieByMovieName(String movieName);

    String selectIntroByMoviename(String movieName);
}
