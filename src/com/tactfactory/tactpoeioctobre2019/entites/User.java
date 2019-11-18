package com.tactfactory.tactpoeioctobre2019.entites;

public class User {

  private long id;
  private String firstname;
  private String lastname;
  private Boolean isValidate;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Boolean getIsValidate() {
    return isValidate;
  }

  public void setIsValidate(Boolean isValidate) {
    this.isValidate = isValidate;
  }

}
