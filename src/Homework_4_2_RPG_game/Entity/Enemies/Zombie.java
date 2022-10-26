package Homework_4_2_RPG_game.Entity.Enemies;

import Homework_4_2_RPG_game.Entity.Heroes._Hero;

import java.util.Random;

public class Zombie extends _Enemy {
    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public Zombie(String name, int health) {
        super(name, health);
        this.type = "Zombie";
    }

    @Override
    public void attackHero(_Hero hero) {
            hero.takeDamage(5);
            System.out.println(name + " attacking " + hero.getName() + "!");
    }

    public static int getHealthNew(int health){
        return health / 2;
    }

    public static void zombieResurrect(_Enemy enemy){
        Random random = new Random();
        int health = 50;
        health = getHealthNew(health);
        if (enemy.getHealth() <= 0) {
//            if (random.nextInt(20+1) <= 15) {
//                enemy.setHealth(0);
//            } else {
                System.out.println("Zombie resurrect!");
                enemy.setHealth(health);
//            }
        }
    }
}
