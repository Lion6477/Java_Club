package Homework_4_2_RPG_game.Actions.GetHeroOrEnemy;

import Homework_4_2_RPG_game.Entity.Heroes._Hero;

import java.util.ArrayList;

public class GetHeroByNumber {
    public static _Hero getHeroByNumber(int heroNumber, ArrayList<_Hero> heroArrayList){
        return heroArrayList.get(heroNumber - 1);
    }
}
