package Forces.CodeFRE.R800.T_71A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listStrings = new ArrayList<>();

        var n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            var str = scanner.next();
            if(str.length() > 10){
                listStrings.add(sizeSting(str));
            }else {
                listStrings.add(str);
            }

        }


        for(String str : listStrings){
            System.out.println(str);
        }
    }

    private static String sizeSting(String str) {
        int counter = 0;
        var chars = str.toCharArray();
        for(int i = 1; i < chars.length - 1; i++){
            counter++;
        }
        var oneChar = chars[0];
        var twoChar = chars[str.length()-1];

        return String.valueOf(oneChar) +
                counter +
                twoChar;
    }
}
