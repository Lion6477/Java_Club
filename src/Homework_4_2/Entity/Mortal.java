package Homework_4_2.Entity;

public interface Mortal {
    default boolean isAlive() {
        return false;
    }
}

