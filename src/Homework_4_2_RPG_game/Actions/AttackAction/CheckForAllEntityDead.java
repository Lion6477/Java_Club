package Homework_4_2_RPG_game.Actions.AttackAction;

import Homework_4_2_RPG_game.Entity.Enemies._Enemy;
import Homework_4_2_RPG_game.Entity.Heroes._Hero;

import java.util.ArrayList;

public class CheckForAllEntityDead {
    public static boolean checkForAllEnemiesDead(ArrayList<_Enemy> enemyArrayList){
//        int countDeadEnemies = 0;
//        for (int i = 0; i < enemyArrayList.size(); i++) {
//            _Enemy enemyTempFor = enemyArrayList.get(i);
//            if (!enemyTempFor.isAlive()) {
//                countDeadEnemies++;
//            }
//        }
//        System.out.println("Number of dead enemies: " + countDeadEnemies);
//        if (countDeadEnemies == enemyArrayList.size()){
//            return true;
//        } else {
//            return false;
//        }
        if (enemyArrayList.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkForAllHeroesDead(ArrayList<_Hero> heroArrayList){
//        int countDeadHeroes = 0;
//        for (int i = 0; i < heroArrayList.size(); i++) {
//            _Hero heroTempFor = heroArrayList.get(i);
//            if (!heroTempFor.isAlive()) {
//                countDeadHeroes++;
//            }
//        }
//        System.out.println("Number of dead heroes: " + countDeadHeroes);
//        if (countDeadHeroes == heroArrayList.size()){
//            return true;
//        } else {
//            return false;
//        }
        if (heroArrayList.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

}
