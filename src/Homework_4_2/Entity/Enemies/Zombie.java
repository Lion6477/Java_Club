package Homework_4_2.Entity.Enemies;

import Homework_4_2.Entity.Heroes._Hero;

import java.util.Random;

public class Zombie extends _Enemy {
    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(_Hero hero) {
            hero.takeDamage(5);
            System.out.println(name + " attacking " + hero.getName() + "!");
    }

    public static int getHealthNew(int healthStandart){
        return healthStandart / 2;
    }

    public static void zombieResurrect(_Enemy enemy){
        Random random = new Random();
        int healthStandart = 50;
        int health = getHealthNew(healthStandart);
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
