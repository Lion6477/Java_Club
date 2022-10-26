package Homework_4_2.Actions.AttackAction;

import Homework_4_2.Entity.Enemies.Zombie;
import Homework_4_2.Entity.Enemies._Enemy;
import Homework_4_2.Entity.Heroes._Hero;

import java.util.ArrayList;

import static Homework_4_2.Entity.Enemies.Zombie.zombieResurrect;

public class CheckHealthEnemy {
    static _Enemy zombie = new Zombie("ZombieDefoult", 50);
    public static void checkHealthEnemy(_Hero hero, _Enemy enemy, ArrayList<_Enemy> enemyArrayList){
        if (enemy.isAlive()) {
            System.out.println("Enemy health now: " + enemy.getHealth());

        } else {
            if (zombie.equals(enemy)){
                zombieResurrect(enemy);
            }
            if (enemy.isAlive()) {
                System.out.println("Enemy health now: " + enemy.getHealth());

            } else {
                enemyArrayList.remove(enemy);
                System.out.println("Enemy has been defeated by " + hero.getName() + "!");
            }
        }
    }
}
