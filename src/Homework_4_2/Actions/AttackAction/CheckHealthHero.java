package Homework_4_2.Actions.AttackAction;

import Homework_4_2.Entity.Enemies._Enemy;
import Homework_4_2.Entity.Heroes._Hero;

import java.util.ArrayList;

public class CheckHealthHero {
    public static void checkHealthHero(_Hero hero, _Enemy enemy, ArrayList<_Hero> heroArrayList){
        if (hero.isAlive()) {
            System.out.println("Hero health now: " + hero.getHealth());

        } else {
            if (hero.isAlive()) {
                System.out.println("Enemy health now: " + hero.getHealth());

            } else {
                heroArrayList.remove(hero);
                System.out.println("Hero has been defeated by" + enemy.getName() + "!");
            }
        }
    }
}

