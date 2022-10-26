package Homework_4_2_RPG_game.Entity.Heroes;

import Homework_4_2_RPG_game.Entity.Enemies._Enemy;

public class Archer extends _Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(_Enemy enemy) {
            enemy.takeDamage(15);
            System.out.println(name + " attacking enemy using bow!");
    }
    @Override
    public void heroAttacking(_Hero hero, _Enemy enemy){
        hero.attackEnemy(enemy);
    }
}
