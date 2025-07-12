package org.example;

// import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare
  int test;

  Monster() {
    // Random random = new Random();
    this.name = this.summonMonster(2);
    this.rare = 4;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
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

    return this.name + ":レア度[" + this.rare + "]";
  }
}
