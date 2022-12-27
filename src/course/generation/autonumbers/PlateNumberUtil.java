package course.generation.autonumbers;

import java.util.Arrays;
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
    private static String lastIssuedNumber = "А000АА";

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
        String result = generateNextPlateNumber();
        if (!allNumbers.contains(result)) {
            allNumbers.add(result);

        } else if (result.equals("NUMBERS IS OVERFLOW")) {
            throw new RuntimeException("Sorry, but gg");
        } else {
            return getNextPlateNumber();
        }
        return result + " " + REGION;
    }

    private String generateNextPlateNumber() {
        String result = lastIssuedNumber;
        if (allNumbers.size() > 0) {
            String firstLitter = lastIssuedNumber.substring(0, 1);
            String numbers = lastIssuedNumber.substring(1, 4);
            String secondLitter = lastIssuedNumber.substring(4, 5);
            String thirdLitter = lastIssuedNumber.substring(5, 6);
            short parseNum = (short) (Short.parseShort(numbers) + 1);
            String prefix;
            if (parseNum <= MAX_VALUE - 1) {
                if (parseNum < MAX_VALUE / 100) {
                    prefix = "00";
                } else if (parseNum < MAX_VALUE / 10) {
                    prefix = "0";
                } else {
                    prefix = "";
                }
                result = firstLitter + prefix + (parseNum) + secondLitter + thirdLitter;
            } else {
                if (!thirdLitter.equals(litters[litters.length - 1])) {
                    int index = Arrays.asList(litters).indexOf(thirdLitter);
                    result = firstLitter + ZERO + secondLitter + litters[index + 1];
                } else {
                    if (!secondLitter.equals(litters[litters.length - 1])) {
                        int index = Arrays.asList(litters).indexOf(secondLitter);
                        result = firstLitter + ZERO + litters[index + 1] + litters[0];
                    } else {
                        if (!firstLitter.equals(litters[litters.length - 1])) {
                            int index = Arrays.asList(litters).indexOf(firstLitter);
                            result = litters[index + 1] + ZERO + litters[0] + litters[0];
                        } else {
                            return OVERFLOW;
                        }
                    }
                }
            }
        }
        lastIssuedNumber = result;
        return result;
    }

}
