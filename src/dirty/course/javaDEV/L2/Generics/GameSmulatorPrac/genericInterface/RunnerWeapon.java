package dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.genericInterface;

import dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.Archer;
import dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.Enemy;
import dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.Hero;
import dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.Mage;
import dirty.course.javaDEV.L2.Generics.GameSmulatorPrac.Warrior;

public class RunnerWeapon {
    public static void main(String[] args) {

        Archer<Bow> archer2 = new Archer<>("Леголаc" , 22);
        archer2.setWeapon(new Bow());

        Warrior<Sword> warrior2 = new Warrior<>("Боромир", 11);
        warrior2.setWeapon(new Sword());

        Hero<Sword> warrior = new Warrior<>("Боромир", 11);
        Hero<Wand> mage = new Mage<>("Гэндольф", 33);
        Archer<Bow> archer = new Archer<>("Леголас", 22);

//        Wolf wolf = new Wolf("Second wolf", 11);
        Archer<Bow>.Wolf wolf = archer.new Wolf("Second wolf", 21);

        Enemy enemy = new Enemy("Зомби", 150);

        //TrainingGround.attackEnemy(enemy, warrior, mage, archer);

        printWeaponDamage(archer2);
    }

    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero){
       System.out.println(hero.getWeapon().getDamage());
    }
}
