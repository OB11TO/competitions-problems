package Course.javaDEV.L2.String;

public class Task2 {
    public static void main(String[] args) {
        String value = "baki dlk dfsd llkdf dfs baki";
        String errorValue = "asdadlfk ldlfl dlfld; baki";

        String str = "baki";

        boolean result = isStartedAndEnd(value,str);
        boolean result2 = isStartedAndEnd(errorValue,str);

        System.out.println(result);
        System.out.println(result2);



    }

    private static boolean isStartedAndEnd(String value, String word){
        return value.startsWith(word) && value.endsWith(word);
    }
}
