/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swen6301.builder.entity;

/**
 *
 * @author tareq
 */
public class Patient {

  private String firstName;
  private String middleName;
  private String lastName;
  private long age;
  private long weight;
  private long height;
  private boolean organDonor;
  private Gender sex = Gender.NONE;
  private BloodType bloodType = BloodType.NONE;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }

  public long getWeight() {
    return weight;
  }

  public void setWeight(long weight) {
    this.weight = weight;
  }

  public long getHeight() {
    return height;
  }

  public void setHeight(long height) {
    this.height = height;
  }

  public boolean isOrganDonor() {
    return organDonor;
  }

  public void setOrganDonor(boolean organDonor) {
    this.organDonor = organDonor;
  }

  public Gender getSex() {
    return sex;
  }

  public void setSex(Gender sex) {
    this.sex = sex;
  }

  public BloodType getBloodType() {
    return bloodType;
  }

  public void setBloodType(BloodType bloodType) {
    this.bloodType = bloodType;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Utility method to get a patient builder
   *
   * @return a Patient Builder
   */
  public static PatientBuilder Builder() {
    return new PatientBuilder();
  }
}
