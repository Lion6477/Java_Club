package Homework_4_2_RPG_game.Actions.AttackAction;

import Homework_4_2_RPG_game.Entity.Enemies._Enemy;
import Homework_4_2_RPG_game.Entity.Heroes._Hero;

import java.util.ArrayList;

import static Homework_4_2_RPG_game.Entity.Enemies.Zombie.zombieResurrect;

public class CheckHealthEnemy {
    public static void checkHealthEnemy(_Hero hero, _Enemy enemy, ArrayList<_Enemy> enemyArrayList){
        if (enemy.isAlive()) {
            System.out.println("Enemy health now: " + enemy.getHealth());

        } else {
            if ("Zombie".equals(enemy.getType())){
                zombieResurrect(enemy);
                System.out.println("Zombie exit");
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
