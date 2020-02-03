package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  static final String[] positiveTestData = {
      "racecar",
      "Race Car",
      "radar",
      "",
      "x",
      "xX",
      "A man, a plan, a canal - Panama!"
  };
  static final String[] negativeTestData = {
      "xy",
      "sonar",
      "madem, I'm Adam",
      "Burrito Dog"
  };

  @Test
  void isPalindromeAffirmative() {
    for (String testCase : positiveTestData) {
      assertTrue(Palindromes.isPalindrome(testCase));
    }
  }
    @Test
    void isPalindromeNegative () {
      for (String testCase : negativeTestData) {
        assertFalse(Palindromes.isPalindrome(testCase));
      }
    }
  }
