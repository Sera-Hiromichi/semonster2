package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void testToString() {
    Monster monster = new Monster();
    String expected = "ドラゴン:レア度[4]";
    assertEquals(expected, monster.toString());
  }

  @Test
  public void testsummonMonster() {
    Monster monster = new Monster();
    String expected = "ドラゴン";
    assertEquals(expected, monster.summonMonster(2));
  }

  @Test
  public void testDragonMonster() {
    Monster monster = new Monster();
    String expected = "どらぴっぴ";
    assertEquals(expected, monster.doragonName());
  }
}
