package Homework_4_2_RPG_game.Entity.Heroes;

import Homework_4_2_RPG_game.Entity.Enemies._Enemy;
import Homework_4_2_RPG_game.Entity.Mortal;

public abstract class _Hero implements Mortal {
    protected String name;
    protected int health;

    public _Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(_Enemy enemy);

    public void takeDamage(int damage){
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void heroAttacking(_Hero hero, _Enemy enemy){
        hero.attackEnemy(enemy);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}

