package Homework_4_1;

public class Enemy {
    int health;

    public Enemy(int health) {
        this.health = health;
    }

    void takeDamage(int damage){
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
