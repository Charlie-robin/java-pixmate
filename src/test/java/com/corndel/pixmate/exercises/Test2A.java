 package com.corndel.pixmate.exercises;
 import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Test2A {

  //should sum numbers that are either even or greater than 10, but not both
  @Test
  void testName() {
    assertEquals(sumSelective(new int[] {1, 4, 12, 15, 20, 5, 8, 10}), 37);
  }

  //should return 0 for an empty array
  @Test
  void testName() {
    assertEquals(sumSelective(new int[] {}), 0);
  }

  //should correctly handle arrays with only even numbers
  @Test
  void testName() {
    assertEquals(sumSelective(new int[] {2, 4, 6, 8, 10}), 30);
  }

  //should correctly handle arrays with numbers only greater than 10
  @Test
  void testName() {
    assertEquals(sumSelective(new int[] {11, 13, 15}), 39);
  }

  //should skip numbers that are both even and greater than 10
  @Test
  void testName() {
    assertEquals(sumSelective(new int[] {12, 14, 16, 3, 5}), 0);
  }

  //should handle large arrays
  @Test
  void testName() {
    var largeArray = Array.from({ length: 50 }, (_, i) => i);
    assertEquals(sumSelective(largeArray), 630);
  }
}
