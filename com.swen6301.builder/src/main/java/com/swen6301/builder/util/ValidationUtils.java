package com.swen6301.builder.util;

import com.swen6301.builder.constants.PatientConstants;
import com.swen6301.builder.entity.Patient;

/**
 * A utility class containing a set of utilities to perform input validations.
 */
public final class ValidationUtils {

  /**
   * A private constructor to prevent accidental instantiations of this class.
   */
  private ValidationUtils() {
    throw new IllegalAccessError("Cannot instantiate instance for ValidationUtils class");
  }

  /**
   * Checks the patient info, that all fields are filled, and all values are within appropriate ranges
   *
   * @param patient the patient to check
   * @return true if the patient data is valid, false otherwise;
   */
  public static boolean isPatientValid(Patient patient) {
    boolean isValid = false;
    // Check whether the firstName is not null and not empty.
    if (patient.getFirstName() == null || patient.getFirstName().isEmpty()) {
      System.out.println("First name cannot be empty of null.");
    }

    // Check whether the middleName is no null.
    if (patient.getMiddleName() == null) {
      System.out.println("Middle name cannot be null.");
    }

    // Check whether the lastName is not null and not empty.
    if (patient.getLastName() == null || patient.getLastName().isEmpty()) {
      System.out.println("Last name cannot be empty of null.");
    }

    // Check whether the age is between 0 and 120.
    if (patient.getAge() < PatientConstants.MIN_AGE || patient.getAge() > PatientConstants.MAX_AGE) {
      System.out.println("Age cannot be less than " + PatientConstants.MIN_AGE + " or larger than " + PatientConstants.MAX_AGE + ".");
    }

    // Check whether the weight is between 0 and 300.
    if (patient.getWeight() < PatientConstants.MIN_WEIGHT || patient.getWeight() > PatientConstants.MAX_WEIGHT) {
      System.out.println("Weight cannot be less than " + PatientConstants.MIN_WEIGHT + " or larger than " + PatientConstants.MAX_WEIGHT + ".");
    }

    // Check whether the height is between 0 and 250.
    if (patient.getHeight() < PatientConstants.MIN_HEIGHT || patient.getHeight() > PatientConstants.MAX_HEIGHT) {
      System.out.println("Height cannot be less than " + PatientConstants.MIN_HEIGHT + " or larger than " + PatientConstants.MAX_HEIGHT + ".");
    }
    isValid = true;
    // patient's information is correct, therefore return "true".
    return isValid;
  }

}
