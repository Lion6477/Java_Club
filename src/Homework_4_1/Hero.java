package Homework_4_1;

class Hero {
    protected String name;
    public Hero(String name) {
        this.name = name;
    }

    void attackEnemy(Enemy enemy){
        enemy.takeDamage(10);
        System.out.println(name + " attacking enemy!");
    }

}
class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }
    @Override
    void attackEnemy(Enemy enemy){
        enemy.takeDamage(10);
        System.out.println(name + " attacking enemy using sword!");
    }
}
class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }
    @Override
    void attackEnemy(Enemy enemy){
        enemy.takeDamage(20);
        System.out.println(name + " attacking enemy using fireball!");
    }
}
class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }
    @Override
    void attackEnemy(Enemy enemy){
        enemy.takeDamage(15);
        System.out.println(name + " attacking enemy using bow!");
    }
}
