package Homework_4_2_RPG_game.Actions.AttackAction;

import Homework_4_2_RPG_game.Entity.Enemies._Enemy;
import Homework_4_2_RPG_game.Entity.Heroes._Hero;

import java.util.ArrayList;

import static Homework_4_2_RPG_game.Actions.AttackAction.CheckForAllEntityDead.checkForAllEnemiesDead;
import static Homework_4_2_RPG_game.Actions.AttackAction.CheckForAllEntityDead.checkForAllHeroesDead;

public class CheckForGameOver {
    public static void checkForEnemiesGameOver(ArrayList<_Enemy> enemyArrayList) {
        if (checkForAllEnemiesDead(enemyArrayList)) {
            System.exit(3);
        }
    }
    public static void checkForHeroesGameOver(ArrayList<_Hero> heroArrayList) {
        if (checkForAllHeroesDead(heroArrayList)) {
            System.exit(3);
        }
    }
}
