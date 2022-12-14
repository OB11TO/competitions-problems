package course.javaDEV.L2.Generics.GameSmulatorPrac;


import course.javaDEV.L2.Generics.GameSmulatorPrac.genericInterface.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    private final Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стрельнул из лука в " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    public class Wolf {

        private final String name;
        private final int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совместный урон");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}