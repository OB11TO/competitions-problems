package dirty.course.javaDEV.L2.String;

public class Task4 {
    public static void main(String[] args) {

        String value = "Fsasffs .,! sda ,.dfdfd";
        System.out.println(countSymbol(value));

    }

    private static int countSymbol(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() -  result.length();
    }

}
