package Homework_4_2;

public class Enemy implements Mortal {
    int health;

    @Override
    public boolean isAlive() {
        return health > 0;
    }

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
