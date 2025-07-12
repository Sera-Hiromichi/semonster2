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
  public void testMergeMonster() {
    Monster monster = new Monster();
    Monster monster2 = new Monster();
    Monster Mazimon = new Monster();
    Mazimon.MergeMonster(monster, monster2);
    String expectedname = "ドラゴン";
    int expectedrare = 8;
    assertEquals(expectedname, Mazimon.name);
    assertEquals(expectedrare, Mazimon.rare);
  }
}
