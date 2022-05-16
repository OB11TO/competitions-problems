package Course.javaDEV.L2.Collection.TASK1;

import java.util.HashMap;
import java.util.Map;

public class WordUtil {
    private static final String EMPTY = "";
    private static final String SPACE = " ";

    private WordUtil() {
    }

    public static Map<String, Integer> calcWordFrequency(String text){
        Map<String, Integer> resultMap = new HashMap<>();
        String[] words = text
                .replace(".", EMPTY)
                .replace(",", EMPTY)
                .replace("!", EMPTY)
                .split(SPACE);

        for(String word : words){
            Integer oldGet = resultMap.get(word);
            Integer newGet = oldGet == null ? 1 : oldGet+1;
            resultMap.put(word, newGet);
        }

        return resultMap;
    }
}
