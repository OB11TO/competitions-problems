package Course.javaDEV.lambda.comparableTest;

import java.util.Arrays;
import java.util.Objects;

public class T1Cat {
    public static void main(String[] args) {
        Cat a = new Cat("Art", 12);   // a = c full   / a == d age
        Cat b = new Cat("Brt", 11);
        Cat c = new Cat("Art", 12);
        Cat d = new Cat("Drt", 1);
        Cat e = new Cat("Ert", 12);



        System.out.println(sgn(a.compareTo(b)) == -sgn(b.compareTo(a)));
        System.out.println((a.compareTo(b) > 0 && b.compareTo(d) >0) && a.compareTo(d) > 0);
        System.out.println(a.compareTo(c) == 0 && (sgn(a.compareTo(b)) == sgn(c.compareTo(b))));
        System.out.println();

        System.out.println(a.equals(c)  && a.compareTo(c) == 0);
        System.out.println(a.compareTo(c) == 0 && a.equals(c));
        System.out.println(a.compareTo(b) != 0 && !a.equals(b));
        System.out.println(a.compareTo(e) != 0 && !a.equals(e));

        System.out.println();


        Cat[] cats = new Cat[] {a, b, c, d , e};
        for(Cat cat : cats){
            System.out.println(cat);
        }
        System.out.println();

        Arrays.sort(cats);

        for(Cat cat : cats){
            System.out.println(cat);
        }


    }

    private static int sgn(int x){
        if(x > 0) return 1;
        else if(x < 0) return -1;
        return 0;
    }
}

class Cat implements Comparable<Cat> {
    private final String name;
    private final int age;

    public Cat(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }


    @Override
    public int compareTo(Cat o) {
        if(o == null) throw new NullPointerException();
        if(this.age > o.age) return 1;
        if(this.age < o.age) return -1;

        return this.name.compareTo(o.name);
    }
}
