package Homework_4_2.Entity.Heroes;

import Homework_4_2.Entity.Enemies._Enemy;

public class Mage extends _Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(_Enemy enemy) {
            enemy.takeDamage(20);
            System.out.println(name + " attacking enemy using fireball!");
    }
    @Override
    public void heroAttacking(_Hero hero, _Enemy enemy){
        hero.attackEnemy(enemy);
    }
}
