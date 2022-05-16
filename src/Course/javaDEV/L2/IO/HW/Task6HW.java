package Course.javaDEV.L2.IO.HW;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Task6HW {
    public static void main(String[] args) throws IOException {
        Path pathInput = Path.of("src", "javaDEV", "L2", "IO", "resources", "test.txt");

        Map<Character, Integer> characterCountMap = new HashMap<>();

        List<String> listLines = Files.readAllLines(pathInput);

      listLines.stream()
                .map(Task6HW::characterSearchCountMap)
                .forEach(System.out::println);

      /*  for(Map<Character, Integer> map : mapList){
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for (Iterator<Map.Entry<Character, Integer>> iterator = entrySet.iterator(); iterator.hasNext();){
                Map.Entry<Character, Integer> entry = iterator
                        .next();
                System.out.println(entry.getKey() + " relative frequency ="
                        + ((float) entry.getValue()) / text.length());
            }
        }*/


      /*  Set<Entry<Character, Integer>> entrySet = characterCountMap.entrySet();

        for (Iterator iterator = entrySet.iterator(); iterator.hasNext();)
        {
            Entry<Character, Integer> entry = (Entry<Character, Integer>) iterator
                    .next();
            System.out.println(entry.getKey() + " relative frequency ="
                    + ((float) entry.getValue()) / text.length());

        }*/


    }

    private static  Map<Character,Integer> characterSearchCountMap(String line) {
        Map<Character,Integer> result = new HashMap<>();

        for(int i = 0; i < line.length(); i++){
            char c = line.charAt(i);
            result.merge(c, 1, Integer::sum);

        }

            Set<Map.Entry<Character, Integer>> entrySet = result.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            /*System.out.println(entry.getKey() + " relative frequency ="
                    + ((float) entry.getValue()) / line.length());*/
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        return  result;
    }
}
