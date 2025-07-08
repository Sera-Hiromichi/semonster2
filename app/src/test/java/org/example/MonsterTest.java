package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {
 @Test
  public void testToString() {
    Monster monster = new Monster();
    String expected = "スライム:レア度[2]";
    assertEquals(expected,monster.toString());
  }
}
