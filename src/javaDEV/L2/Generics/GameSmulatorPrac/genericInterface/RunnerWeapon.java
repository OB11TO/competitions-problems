package javaDEV.L2.Generics.GameSmulatorPrac.genericInterface;

import javaDEV.L2.Generics.GameSmulatorPrac.*;

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

        TrainingGround.attackEnemy(enemy, warrior, mage, archer);
    }
}
