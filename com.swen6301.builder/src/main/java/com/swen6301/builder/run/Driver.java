package com.swen6301.builder.run;

import com.swen6301.builder.util.PersistenceUtils;
import com.swen6301.builder.util.RandomUtils;

/**
 * A dummy driver class that simulates a driver class for this project.
 */
public class Driver {

  public static void main(String[] args) {

    // Create 1000 random samples.
    for (int i = 0; i < 1000; i++) {
      System.out.println("****************");
      createRandomPatientInfo();
      System.out.println("****************");
    }
  }

  /**
   * Creates a sample patient info and store them on internal storage.
   */
  public static void createRandomPatientInfo() {
    String firstName = RandomUtils.randomIdentifier();
    String middleName = RandomUtils.randomIdentifier();
    String lastName = RandomUtils.randomIdentifier();
    int age = RandomUtils.randomPositiveNumber(120);
    int weight = RandomUtils.randomPositiveNumber(300);
    String sex = RandomUtils.randomSexString();
    int height = RandomUtils.randomPositiveNumber(250);
    boolean organDonor = RandomUtils.randomBoolean();
    String bloodType = RandomUtils.randomBloodType();
    boolean success = PersistenceUtils.storePatientInfo(firstName, middleName, lastName, age, weight, sex, height, organDonor, bloodType);
    if (success) {
      System.out.println("Patient [" + firstName + ", " + lastName + "] has been successfully processed!");
    } else {
      System.out.println("An error occurred while processing info for patient [" + firstName + ", " + lastName + "]!");
    }
  }

}
