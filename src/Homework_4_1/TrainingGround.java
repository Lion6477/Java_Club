package Homework_4_1;

public class TrainingGround {
    public static void main(String[] args) {
        Warrior charWarrior = new Warrior("charWarrior");
        charWarrior.attackEnemy(new Enemy(100));
        Mage charMage = new Mage("charMage");
        charMage.attackEnemy(new Enemy(100));
        Archer charArcher = new Archer("charArcher");
        charArcher.attackEnemy(new Enemy(100));
    }
}
