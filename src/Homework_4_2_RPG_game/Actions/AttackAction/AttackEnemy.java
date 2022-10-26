package Homework_4_2_RPG_game.Actions.AttackAction;

import Homework_4_2_RPG_game.Entity.Enemies._Enemy;
import Homework_4_2_RPG_game.Entity.Heroes._Hero;

import java.util.ArrayList;

import static Homework_4_2_RPG_game.Actions.AttackAction.CheckHealthEnemy.checkHealthEnemy;

public class AttackEnemy {
    public static void attackEnemy(_Hero hero, _Enemy enemy, ArrayList<_Enemy> enemyArrayList){
        if (enemy.isAlive() && hero.isAlive()) {

            hero.heroAttacking(hero, enemy);
            checkHealthEnemy(hero, enemy, enemyArrayList);

        } else if (!enemy.isAlive()) {
            System.out.println("Enemy already dead");
        }/* else if (!hero.isAlive()){
            System.out.println("Hero already dead");
        }*/
    }
}
