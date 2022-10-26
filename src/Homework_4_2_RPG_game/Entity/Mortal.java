package Homework_4_2_RPG_game.Entity;

public interface Mortal {
    default boolean isAlive() {
        return false;
    }
}

