package Homework_4_2;

import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mage mage = new Mage("Serhii");
        Enemy enemy = new Enemy(100);

        while (true){
            System.out.println("Type 1 for attacking enemy:");
            int input = scanner.nextInt();
            if (input == 0) {
                System.exit(1);
            } else if (input == 1) {
                mage.attackEnemy(enemy);
                System.out.println("Enemy health now: " + enemy.getHealth());
            } else {
                //TODO feature enemies
                System.out.println("TODO");
            }
        }



    }
}
