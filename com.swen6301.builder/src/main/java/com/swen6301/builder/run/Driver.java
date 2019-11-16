package com.swen6301.builder.run;

import com.swen6301.builder.constants.PatientConstants;
import com.swen6301.builder.entity.Patient;
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
    Patient patient = Patient.Builder()
     .age(RandomUtils.randomPositiveNumber(PatientConstants.MAX_AGE))
     .height(RandomUtils.randomPositiveNumber(PatientConstants.MAX_HEIGHT))
     .weight(RandomUtils.randomPositiveNumber(PatientConstants.MAX_WEIGHT))
     .firstName(RandomUtils.randomIdentifier())
     .middleName(RandomUtils.randomIdentifier())
     .lastName(RandomUtils.randomIdentifier())
     .bloodType(RandomUtils.randomBloodTypeEnum())
     .sex(RandomUtils.randomSexEnum())
     .organDonor(RandomUtils.randomBoolean()).build();
    boolean success = PersistenceUtils.storePatientInfo(patient);
    if (success) {
      System.out.println("Patient [" + patient.getFirstName() + ", " + patient.getLastName() + "] has been successfully processed!");
    } else {
      System.out.println("An error occurred while processing info for patient [" + patient.getFirstName() + ", " + patient.getLastName() + "]!");
    }
  }

}
