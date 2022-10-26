package Homework_4_2_RPG_game.Entity.Heroes;

import Homework_4_2_RPG_game.Entity.Enemies._Enemy;

public class Warrior extends _Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(_Enemy enemy) {
            enemy.takeDamage(10);
            System.out.println(name + " attacking enemy using sword!");
    }
    @Override
    public void heroAttacking(_Hero hero, _Enemy enemy){
        hero.attackEnemy(enemy);
    }
}
