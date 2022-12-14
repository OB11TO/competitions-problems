package course.javaDEV.L2.Generics.GameSmulatorPrac;

import course.javaDEV.L2.Generics.GameSmulatorPrac.genericInterface.Weapon;

public abstract class Hero<T extends Weapon> {

    private final String name;
    private final int damage;
    private T weapon;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}