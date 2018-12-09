package com.zhbit210.model.pojo;

public class Orders {

  private long id;
  private long movieId;
  private Movie movie;
  private long userId;
  private User user;
  private long line;
  private long row;
  private double price;
  private String status;

  public Orders() {
  }

  public Orders(long movieId, long userId, long line, long row, double price, String status) {
    this.movieId = movieId;
    this.userId = userId;
    this.line = line;
    this.row = row;
    this.price = price;
    this.status = status;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getLine() {
    return line;
  }

  public void setLine(long line) {
    this.line = line;
  }


  public long getRow() {
    return row;
  }

  public void setRow(long row) {
    this.row = row;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "Orders{" +
            "id=" + id +
            ", movie=" + movie +
            ", user=" + user +
            ", line=" + line +
            ", row=" + row +
            ", price=" + price +
            ", status='" + status + '\'' +
            '}';
  }
}
