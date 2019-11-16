package com.swen6301.builder.util;

import com.swen6301.builder.entity.Patient;

/**
 * Contains utilities to communicate with internal storage.
 */
public final class PersistenceUtils {

  /**
   * A private constructor to prevent accidental instantiations of this class.
   */
  private PersistenceUtils() {
    throw new IllegalAccessError("Cannot instantiate instance for PersistenceUtils class");
  }

  /**
   * Stores patient's info in internal storage See comments associated with parameter to see required info and non-required info.
   */
  public static boolean storePatientInfo(Patient patient) {
    if (!ValidationUtils.isPatientValid(patient)) {
      return false;
    }
    //store stuff
    return true;
  }

}
