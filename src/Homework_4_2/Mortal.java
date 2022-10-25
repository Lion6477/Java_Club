package Homework_4_2;

public interface Mortal {
    default boolean isAlive() {
        return false;
    }
}
