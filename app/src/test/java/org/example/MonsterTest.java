package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void testToString() {
    Monster monster = new Monster();
    String expected = "Dragon:rare[4], HP[12]";
    assertEquals(expected, monster.toString());
  }

  @Test
  public void testsummonMonster() {
    Monster monster = new Monster();
    String expected = "Dragon";
    assertEquals(expected, monster.summonMonster(2));
  }

  @Test
  public void testMergeMonster() {
    Monster monster = new Monster();
    Monster monster2 = new Monster();
    Monster Mazimon = new Monster();
    Mazimon.MergeMonster(monster, monster2);
    String expectedname = "Dragon";
    int expectedrare = 8;
    assertEquals(expectedname, Mazimon.name);
    assertEquals(expectedrare, Mazimon.rare);
  }
  
  @Test
  public void testDragonMonster() {
    Monster monster = new Monster();
    String expected = "Drapippi";
    assertEquals(expected, monster.doragonName());
  }

  @Test
  public void testMonsterHp() {
    Monster monster = new Monster();
    int expected = 12;
    // Dragonの場合基礎HPは8、rareの値だけ加算するのでHPは12になる
    // Monsterクラスのrareの値は4で固定されている
    assertEquals(expected, monster.setHp());
  }
}
