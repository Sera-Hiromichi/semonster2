package org.example;

// import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare
  int attackpoint;

  Monster() {
    // Random random = new Random();
    this.name = this.summonMonster(2);
    this.rare = 4;
    this.attackpoint = 5;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]";
  }

  public String doragonName() {
    if (this.name == "ドラゴン") {
      return "どらぴっぴ";
    } else {
      return null;
    }
  }

  public String attackString() {
    return this.name + "の攻撃 : " + Integer.toString(this.attackpoint) + "ポイント";
  }
}
