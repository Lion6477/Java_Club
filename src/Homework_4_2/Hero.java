package Homework_4_2;

abstract class Hero {
    protected String name;
    public Hero(String name) {
        this.name = name;
    }

    abstract void attackEnemy(Enemy enemy);

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
        if (enemy.isAlive()){
            enemy.takeDamage(20);
            System.out.println(name + " attacking enemy using fireball!");

        } else {
            System.out.println("Error! Enemy already dead!");
        }
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
