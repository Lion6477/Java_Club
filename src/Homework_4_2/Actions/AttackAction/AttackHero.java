package Homework_4_2.Actions.AttackAction;

import Homework_4_2.Entity.Enemies._Enemy;
import Homework_4_2.Entity.Heroes._Hero;

import java.util.ArrayList;

import static Homework_4_2.Actions.AttackAction.CheckHealthHero.checkHealthHero;

public class AttackHero {
    public static void attackHero(_Enemy enemy, _Hero hero, ArrayList<_Hero> heroesArrayList){
        if (hero.isAlive() && enemy.isAlive()) {
            enemy.heroAttacking(enemy, hero);
            checkHealthHero(hero, enemy, heroesArrayList);
        } else if (!hero.isAlive()){
            System.out.println("Hero already dead");
        }/* else if (!enemy.isAlive()) {
            System.out.println("Enemy already dead");
        }*/
    }
}
