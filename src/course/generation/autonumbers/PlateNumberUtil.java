package course.generation.autonumbers;

import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class PlateNumberUtil {

    private static final short MAX_VALUE = 1000;
    private static final String REGION = "161 RUS";
    private static final String ZERO = "000";
    private static final String OVERFLOW = "NUMBERS IS OVERFLOW";
    private static final String[] litters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
    private static final TreeSet<String> allNumbers = new TreeSet<>();
    private static final String lastIssuedNumber = "А000АА";

    public String getRandomPlateNumber() {
        String result = getRandomNumber();
        if (!allNumbers.contains(result)) {
            allNumbers.add(result);
        } else {
            getRandomPlateNumber();
        }
        return result + " " + REGION;
    }

    private String getRandomNumber() {
        Random random = new Random();
        var firstLitter = litters[random.nextInt(litters.length)];
        var n = random.nextInt(MAX_VALUE);
        String number;
        if (n < MAX_VALUE / 100) {
            number = "00" + n;
        } else if (n < MAX_VALUE / 10) {
            number = "0" + n;
        } else {
            number = "" + n;
        }
        var secondLitter = litters[random.nextInt(litters.length)];
        var thirdLitter = litters[random.nextInt(litters.length)];
        return firstLitter + number + secondLitter + thirdLitter;
    }

    public String getNextPlateNumber() {
        return "false";
    }
}
