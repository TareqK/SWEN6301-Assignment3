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
public class PatientBuilder {

  Patient patientToBuild = new Patient();

  public PatientBuilder firstName(String firstName) {
    patientToBuild.setFirstName(firstName);
    return this;
  }

  public PatientBuilder middleName(String middleName) {
    patientToBuild.setMiddleName(middleName);
    return this;
  }

  public PatientBuilder age(long age) {
    patientToBuild.setAge(age);
    return this;
  }

  public PatientBuilder weight(long weight) {
    patientToBuild.setWeight(weight);
    return this;
  }

  public PatientBuilder height(long height) {
    patientToBuild.setHeight(height);
    return this;
  }

  public PatientBuilder organDonor(boolean organDonor) {
    patientToBuild.setOrganDonor(organDonor);
    return this;
  }

  public PatientBuilder sex(Gender sex) {
    patientToBuild.setSex(sex);
    return this;
  }

  public PatientBuilder bloodType(BloodType bloodType) {
    patientToBuild.setBloodType(bloodType);
    return this;
  }

  public PatientBuilder lastName(String lastName) {
    patientToBuild.setLastName(lastName);
    return this;
  }

  public Patient build() {
    return this.patientToBuild;
  }

}
