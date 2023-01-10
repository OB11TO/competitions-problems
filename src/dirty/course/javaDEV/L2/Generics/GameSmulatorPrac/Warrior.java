package dirty.course.javaDEV.L2.Generics.GameSmulatorPrac;

import dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.genericInterface.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " взмахнул мечом на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}