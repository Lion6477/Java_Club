package Homework_4_2.Actions.GetHeroOrEnemy;

import Homework_4_2.Entity.Enemies._Enemy;

import java.util.ArrayList;

public class GetEnemyByNumberInArrayList {
    public static _Enemy getEnemyByNumber(int enemyNumber, ArrayList<_Enemy> enemyArrayList){
        return enemyArrayList.get(enemyNumber - 1);
    }
}
