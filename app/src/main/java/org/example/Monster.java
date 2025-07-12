package org.example;

// import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare
  int hp;

  Monster() {
    // Random random = new Random();
    this.name = this.summonMonster(2);
    this.rare = 4;
    this.hp = this.setHp(name, rare);
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "Slime", "Sahagin", "Dragon", "Durahan", "Seaserpent" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {

    return this.name + ":rare[" + this.rare + "]";
  }

  public String doragonName() {
    if (this.name == "Dragon") {
      return "Drapippi";
    } else {
      return null;
    }
  }

  public int setHp(String name, int rare) {
    int hp = 0;
    if (name.equals("Dragon")) {
      hp = 8;
    } else if (name.equals("Durahan")) {
      hp = 6;
    } else if (name.equals("Seaserpent")) {
      hp = 4;
    } else if (name.equals("Sahagin")) {
      hp = 2;
    } else if (name.equals("Slime")) {
      hp = 0;
    }
    return hp + rare;
  }
}
