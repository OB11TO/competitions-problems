package dirty.course.javaDEV.L2.Generics.GameSmulatorPrac;

import dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.genericInterface.Bow;
import dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.genericInterface.Sword;
import dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.genericInterface.Wand;
import dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.genericInterface.Weapon;

public class TrainingGround {

    public static void main(String[] args) {
        Hero<Sword> warrior = new Warrior<>("Боромир", 15);
        Hero<Wand> mage = new Mage<>("Гэндольф", 20);
        Archer<Bow> archer = new Archer<>("Леголас", 10);

        /*        Wolf wolf = new Wolf("Second wolf", 11);*/
        // Archer<Bow>.Wolf wolf = archer.new Wolf("Second wolf", 11);

        Enemy enemy = new Enemy("Зомби", 100);

        attackEnemy(enemy, warrior, mage, archer);
    }


    @SafeVarargs
    public static void attackEnemy(Enemy enemy, Hero<? extends Weapon>... heroes) {
        while (enemy.isAlive()) {
            for (Hero<?> hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}