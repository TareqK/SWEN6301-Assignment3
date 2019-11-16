package com.swen6301.builder.util;

import com.swen6301.builder.entity.BloodType;
import com.swen6301.builder.entity.Gender;
import java.util.Random;

public class RandomUtils {

  /**
   * An instance of {@link Random} that will be used in generating random identifiers in encolsed methods.
   */
  private final static Random RANDOM = new Random(System.currentTimeMillis());

  /**
   * A private constructor to prevent accidental instantiations of this class.
   */
  private RandomUtils() {
    throw new IllegalAccessError("Cannot instantiate instance for RandomUtils class");
  }

  /**
   * Retrieves a randomized {@link String} of size between 5-10 and the first letter is capitalized.
   *
   * @return A random {@link String}. The returned {@link String} cannot benull
   */
  public static String randomIdentifier() {
    String lexicon = "abcdefghijklmnopqrstuvwxyz";
    int length = RANDOM.nextInt(6) + 5;
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < length; i++) {
      int position = RANDOM.nextInt(lexicon.length());
      char c = lexicon.charAt(position);
      if (i == 0) {
        c = Character.toUpperCase(c);
      }
      builder.append(c);
    }

    return builder.toString();
  }

  /**
   * Generates a random number within the given <code>bound</code>.
   *
   * @param bound An integer to bound the random generations (exclusive).
   * @return An random number.
   */
  public static int randomPositiveNumber(int bound) {
    return RANDOM.nextInt(bound) & Integer.MAX_VALUE;
  }

  /**
   * Generates a random boolean.
   *
   * @return a random boolean.
   */
  public static boolean randomBoolean() {
    return RANDOM.nextBoolean();
  }

  /**
   * Generates a random BloodType for blood type.
   *
   * @return a random blood type
   */
  public static BloodType randomBloodTypeEnum() {
    return BloodType.values()[RANDOM.nextInt(BloodType.values().length)];
  }

  /**
   * Generates a random Gender sex types.
   *
   * @return a random sex type .
   */
  public static Gender randomSexEnum() {

    return Gender.values()[RANDOM.nextInt(Gender.values().length)];
  }

}
