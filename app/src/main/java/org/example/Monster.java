package org.example;

// import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  int attackpoint;
  int test;
  int hp;

  Monster() {
    // Random random = new Random();
    this.name = this.summonMonster(2);
    this.rare = 4;
    this.attackpoint = 5;
    this.hp = this.setHp();
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "Slime", "Sahagin", "Dragon", "Durahan", "Seaserpent" };
    return monsters[mnumber];
  }

  void MergeMonster(Monster a, Monster b) {
    String newa = a.name.substring(0, a.name.length() / 2);
    String newb = b.name.substring(b.name.length() / 2, b.name.length());
    this.name = newa.concat(newb);
    this.rare = a.rare + b.rare;
  }

  @Override
  public String toString() {

    return this.name + ":rare[" + this.rare + "], HP[" + this.hp + "]";
  }

  public String monsterNickname() {
    if (this.name.equals("Dragon")) {
      return "Drapippi";
    } else if (this.name.equals("Slime")) {
      return "Surarin";
    } else if (this.name.equals("Sahagin")) {
      return "Uotami";
    } else if (this.name.equals("Seaserpent")) {
      return "Umihebi";
    } else if (this.name.equals("Durahan")) {
      return "Kaonasi";
    } else {
      return null;
    }
  }

  public String attackString() {
    return this.name + "'s attack : " + Integer.toString(this.attackpoint) + "point";
  }

  public String specialAttack() {
    if (this.name.equals("Dragon")) {
      return "Dragon's Roar";
    } else if (this.name.equals("Slime")) {
      return "Poison Mist";
    } else if (this.name.equals("Sahagin")) {
      return "Spirit Surge";
    } else if (this.name.equals("Seaserpent")) {
      return " Water Curse";
    } else if (this.name.equals("Durahan")) {
      return "Death Sentence";
    } else {
      return null;
    }
  }

  public int setHp() {
    int hp = 0;
    if (this.name.equals("Dragon")) {
      hp = 8;
    } else if (this.name.equals("Durahan")) {
      hp = 6;
    } else if (this.name.equals("Seaserpent")) {
      hp = 4;
    } else if (this.name.equals("Sahagin")) {
      hp = 2;
    } else if (this.name.equals("Slime")) {
      hp = 0;
    }
    return hp + this.rare;

  }
}
