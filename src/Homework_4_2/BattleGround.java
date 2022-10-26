package Homework_4_2;

import Homework_4_2.Entity.Enemies._Enemy;
import Homework_4_2.Entity.Enemies.Zombie;
import Homework_4_2.Entity.Heroes.Mage;
import Homework_4_2.Entity.Heroes._Hero;

import java.util.ArrayList;
import java.util.Scanner;

import static Homework_4_2.Actions.ExitAction0.exitActionCheck;
import static Homework_4_2.Actions.AttackAction.AttackEnemy.attackEnemy;
import static Homework_4_2.Actions.AttackAction.AttackHero.attackHero;
import static Homework_4_2.Actions.AttackAction.CheckForGameOver.checkForEnemiesGameOver;
import static Homework_4_2.Actions.AttackAction.CheckForGameOver.checkForHeroesGameOver;
import static Homework_4_2.Actions.GetHeroOrEnemy.GetEnemyByNumberInArrayList.getEnemyByNumber;
import static Homework_4_2.Actions.GetHeroOrEnemy.GetHeroByNumber.getHeroByNumber;

public class BattleGround {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        ArrayList<_Hero> heroesArrayList = new ArrayList<>();
        Mage mage = new Mage("MageDefoult", 100);
        Mage mage1 = new Mage("Serhii", 100);
        heroesArrayList.add(mage1);

        ArrayList<_Enemy> enemyArrayList = new ArrayList<>();
        _Enemy zombie1 = new Zombie("Zomb1", 50);
        _Enemy zombie2 = new Zombie("Zomb2", 50);
        enemyArrayList.add(zombie1);
        enemyArrayList.add(zombie2);


        System.out.println("Type 9 to exit!");
        while (true) {
            int input;
            System.out.println("Choose hero from 1 to " + heroesArrayList.size() + ":");
            input = scanner.nextInt(); //choosing hero 1
            exitActionCheck(input);

            _Hero hero = getHeroByNumber(input, heroesArrayList);

            while (true){
                System.out.println("Choose action (1 for attack enemy, 2 TODO):");
                input = scanner.nextInt(); //choosing Action

                if (input == 1) { //AttackAction
                    while (true){

                        System.out.println("Type 0 to choosing hero!");
                        System.out.println("Choose enemy for attacking from 1 to " + enemyArrayList.size() + ":");
                        input = scanner.nextInt(); //choosing enemy
                        if (input == 0){
                            break;
                        }
                        _Enemy enemy = getEnemyByNumber(input, enemyArrayList);

                        attackEnemy(hero, enemy, enemyArrayList);
                        checkForEnemiesGameOver(enemyArrayList);
                        attackHero(enemy, hero, heroesArrayList);
                        checkForHeroesGameOver(heroesArrayList);
                    }

                } else {
                    //TODO feature actions
                    System.out.println("TODO");
                }
            }
        }
    }
}
