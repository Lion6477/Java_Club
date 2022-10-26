package Homework_4_2_RPG_game.Actions.GetHeroOrEnemy;

import Homework_4_2_RPG_game.Entity.Enemies._Enemy;

import java.util.ArrayList;

public class GetEnemyByNumberInArrayList {
    public static _Enemy getEnemyByNumber(int enemyNumber, ArrayList<_Enemy> enemyArrayList){
        return enemyArrayList.get(enemyNumber - 1);
    }
}
