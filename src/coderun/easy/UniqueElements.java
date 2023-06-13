package coderun.easy;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 155
public class UniqueElements {

        /*
        Для чтения входных данных необходимо получить их
        из стандартного потока ввода (System.in).
        Данные во входном потоке соответствуют описанному
        в условии формату. Обычно входные данные состоят
        из нескольких строк. Можно использовать более производительные
        и удобные классы BufferedReader, BufferedWriter, Scanner, PrintWriter.

        С помощью BufferedReader можно прочитать из стандартного потока:
        * строку -- reader.readLine()
        * число -- int n = Integer.parseInt(reader.readLine());
        * массив чисел известной длины (во входном потоке каждое число на новой строке) --
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        * последовательность слов в строке --
        String[] parts = reader.readLine().split(" ");

        Чтобы вывести результат в стандартный поток вывода (System.out),
        Через BufferedWriter можно использовать методы
        writer.write("Строка"), writer.write('A') и writer.newLine().

        Возможное решение задачи "Вычислите сумму чисел в строке":
        int sum = 0;
        String[] parts = reader.readLine().split(" ");
        for (int i = 0; i < parts.length; i++) {
            int num = Integer.parseInt(parts[i]);
            sum += num;
        }
        writer.write(String.valueOf(sum));
        */
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(reader.readLine());
            int[] nums = new int[n];
            String[] parts = reader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Set<Integer> uniqueElements = new HashSet<>();
            Set<Integer> repeatedElements = new HashSet<>();

            for(int num : nums) {
                if(!repeatedElements.contains(num)) {
                    if(uniqueElements.contains(num)) {
                        uniqueElements.remove(num);
                        repeatedElements.add(num);
                    } else {
                        uniqueElements.add(num);
                    }
                }
            }

            System.out.println(Arrays.toString(nums));
            System.out.println(uniqueElements.size());
            writer.write(String.valueOf(uniqueElements.size()));

            reader.close();
            writer.close();
        }

    }
