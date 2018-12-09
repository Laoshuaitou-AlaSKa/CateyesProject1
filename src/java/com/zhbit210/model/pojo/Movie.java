package com.zhbit210.model.pojo;


import java.sql.Timestamp;
import java.util.Date;

public class Movie {

  private long id;
  private String movieName;
  private String hallName;
  private Date movieTime;
  private String movieMessage;
  private double moviePrice;

  public Movie() {
  }

  public Movie(long id, String movieName, String hallName, Date movieTime, String movieMessage, double moviePrice) {
    this.id = id;
    this.movieName = movieName;
    this.hallName = hallName;
    this.movieTime = movieTime;
    this.movieMessage = movieMessage;
    this.moviePrice = moviePrice;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getMovieName() {
    return movieName;
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public String getHallName() {
    return hallName;
  }

  public void setHallName(String hallName) {
    this.hallName = hallName;
  }

  public void setMovieTime(Date movieTime) {
    this.movieTime = movieTime;
  }

  public Date getMovieTime() {
    return movieTime;
  }

  public void setMovieTime(java.sql.Timestamp movieTime) {
    this.movieTime = movieTime;
  }


  public String getMovieMessage() {
    return movieMessage;
  }

  public void setMovieMessage(String movieMessage) {
    this.movieMessage = movieMessage;
  }

  public double getMoviePrice() {
    return moviePrice;
  }

  public void setMoviePrice(double moviePrice) {
    this.moviePrice = moviePrice;
  }

  @Override
  public String toString() {
    return "Movie{" +
            "id=" + id +
            ", movieName='" + movieName + '\'' +
            ", hallName='" + hallName + '\'' +
            ", movieTime=" + movieTime +
            ", movieMessage='" + movieMessage + '\'' +
            ", moviePrice=" + moviePrice +
            '}';
  }
}
