package com.zhbit210.model.pojo;


public class UserMessage {

  private long id;
  private long userid;
  private User user;
  private String name;
  private long age;
  private String sex;
  private long phonenum;

    public UserMessage() {
    }

    public UserMessage(String name, long age, String sex, long phonenum) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.phonenum = phonenum;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public long getPhonenum() {
    return phonenum;
  }

  public void setPhonenum(long phonenum) {
    this.phonenum = phonenum;
  }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "id=" + id +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phonenum=" + phonenum +
                '}';
    }
}
