package dirty.course.generation.autonumbers;

public class Main {

    public static void main(String[] args) {

        PlateNumberUtil generate = new PlateNumberUtil();


        System.out.println(generate.getRandomPlateNumber());
        System.out.println(generate.getRandomPlateNumber());
        System.out.println(generate.getNextPlateNumber());

        for (int i = 1; i < 9000; i++) {
            System.out.println(generate.getNextPlateNumber());
        }
    }
}
