package Homework_4_2.Entity.Enemies;

import Homework_4_2.Entity.Heroes._Hero;
import Homework_4_2.Entity.Mortal;

import java.util.Random;

import static Homework_4_2.Entity.Enemies.Zombie.getHealthNew;

public abstract class _Enemy implements Mortal {
    String name;
    int health;
    public _Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public abstract void attackHero(_Hero hero);

    public void heroAttacking(_Enemy enemy, _Hero hero){
        enemy.attackHero(hero);
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    //Abilities

}
