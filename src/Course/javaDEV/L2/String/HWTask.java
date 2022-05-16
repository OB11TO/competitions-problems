package Course.javaDEV.L2.String;


/**
 * 1. Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 * <p>
 * 2. Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ идёт перед большим:
 * Например CM == 900.
 * Соответствие:
 * M 1000
 * D 500
 * C 100
 * L 50
 * X 10
 * V 5
 * I 1
 */
public class HWTask {
    public static void main(String[] args) {
        String value = "а роза упала на лапу Азора";
        boolean res = isPalindrome(value);
        System.out.println(res);

        String str = "CM";
        int result = RimByArabic.convertToArabic(str);
        System.out.println(result);


    }

    public static boolean isPalindrome(String value) {
        // replaceAll("\\W",""): убираем из строки все не нужные символы (знаки препинания, пробелы и т.д.);
        return value.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(value.replaceAll("\\W", ""))
                        .reverse().toString()
                );
    }

}

class RimByArabic {

    static int convertToArabic(String value) {

        return 0;
    }

    static int getArabic(char rimChar) {
      return  switch (rimChar) {
          case 'M' -> 1000;
          case 'D' -> 500;
          case 'C' -> 100;
          case 'L' -> 50;
          case 'X' -> 10;
          case 'V' -> 5;
          case 'I' -> 1;
          default -> 0;
      };
    }
}
