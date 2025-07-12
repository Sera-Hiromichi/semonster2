package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void testToString() {
    Monster monster = new Monster();
    String expected = "Dragon:rare[4]";
    assertEquals(expected, monster.toString());
  }

  @Test
  public void testsummonMonster() {
    Monster monster = new Monster();
    String expected = "Dragon";
    assertEquals(expected, monster.summonMonster(2));
  }

  @Test
  public void testDragonMonster() {
    Monster monster = new Monster();
    String expected = "Drapippi";
    assertEquals(expected, monster.doragonName());
  }

  @Test
  public void testDragonHp() {
    Monster monster = new Monster();
    // Dragonの場合基礎HPは8、rareの値だけ加算
    assertEquals(9, monster.setHp("Dragon", 1));
    assertEquals(10, monster.setHp("Dragon", 2));
    assertEquals(11, monster.setHp("Dragon", 3));
    assertEquals(12, monster.setHp("Dragon", 4));
  }

  @Test
  public void testDurahanHp() {
    Monster monster = new Monster();
    // Durahanの場合基礎HPは6、rareの値だけ加算
    assertEquals(7, monster.setHp("Durahan", 1));
    assertEquals(8, monster.setHp("Durahan", 2));
    assertEquals(9, monster.setHp("Durahan", 3));
    assertEquals(10, monster.setHp("Durahan", 4));
  }

  @Test
  public void testSeaserpentHp() {
    Monster monster = new Monster();
    // Seaserpentの場合基礎HPは4、rareの値だけ加算
    assertEquals(5, monster.setHp("Seaserpent", 1));
    assertEquals(6, monster.setHp("Seaserpent", 2));
    assertEquals(7, monster.setHp("Seaserpent", 3));
    assertEquals(8, monster.setHp("Seaserpent", 4));
  }

  @Test
  public void testSahaginHp() {
    Monster monster = new Monster();
    // Sahaginの場合基礎HPは2、rareの値だけ加算
    assertEquals(3, monster.setHp("Sahagin", 1));
    assertEquals(4, monster.setHp("Sahagin", 2));
    assertEquals(5, monster.setHp("Sahagin", 3));
    assertEquals(6, monster.setHp("Sahagin", 4));
  }

  @Test
  public void testSlimeHp() {
    Monster monster = new Monster();
    // Slimeの場合基礎HPは0、rareの値だけ加算
    assertEquals(1, monster.setHp("Slime", 1));
    assertEquals(2, monster.setHp("Slime", 2));
    assertEquals(3, monster.setHp("Slime", 3));
    assertEquals(4, monster.setHp("Slime", 4));
  }

}
