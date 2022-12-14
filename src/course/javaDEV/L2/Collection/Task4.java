package course.javaDEV.L2.Collection;


import java.util.*;

/**
 *  Сложить два многочлена заданной степени, если коэффициенты
 * многочлена хранятся в объекте HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 * Вывести результирующий многочлен в виде строки: ax^6 + bx^4 +
 * cx^3 + dx + 8
 */

public class Task4 {
    public static void main(String[] args) {

        Map<Integer, Integer> position1 = Map.of(
                0,5,
                1,3,
                3,2,
                5,4,
                6,7
        );

        Map<Integer, Integer> position2 = Map.of(
                0,5,
                3,4,
                5,5,
                6,1
        );

        //System.out.println(sum(position1, position2));

        System.out.println(convertToString(sum(position1,position2)));


    }

    private static String convertToString(Map<Integer, Integer> result){
        Map<Integer, Integer> resultSort = new TreeMap<>(Comparator.reverseOrder());   //Collections.reverseOrder()
        resultSort.putAll(result);

        List<String> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : resultSort.entrySet()){

            String value = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue() + "x^" + entry.getKey();
            list.add(value);
        }

        return String.join(" + ", list);
    }

    private static Map<Integer, Integer> sum(Map<Integer, Integer> position1,
                                             Map<Integer,Integer> position2){

        Map<Integer, Integer> result = new HashMap<>(position1);

        for(Map.Entry<Integer, Integer> entry : position2.entrySet()){
            //Integer orDefault = result.getOrDefault(entry.getKey(), 0); //получаем ключ
          // result.put(entry.getKey(),orDefault + entry.getValue());
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return result;
    }

}
