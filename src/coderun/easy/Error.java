package coderun.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Конечная цель задачи состоит в том, чтобы найти вероятность возникновения ошибки на каждом из серверов, основываясь на вероятностях запросов и ошибок на каждом сервере.
 *
 * Предоставленный вам ввод содержит следующую информацию:
 *
 * Количество серверов (n).
 * Для каждого сервера i (от 1 до n), два числа: a_i и b_i. a_i представляет вероятность, что запрос пойдет на i-й сервер, в процентах, а b_i представляет вероятность, что на i-м сервере случится ошибка, также в процентах.
 * Вам нужно вычислить вероятность, что ошибка произошла на каждом из серверов.
 *
 * Для решения этой задачи вы можете использовать формулу условной вероятности. Обозначим событие A_i как "ошибка на i-м сервере", а событие B как "ошибка в системе". Тогда вероятность P(A_i | B), то есть вероятность того, что ошибка произошла на i-м сервере при условии возникновения ошибки в системе, можно вычислить следующим образом:
 *
 * P(A_i | B) = (P(B | A_i) * P(A_i)) / P(B)
 *
 * где P(B | A_i) - вероятность возникновения ошибки в системе при условии, что ошибка произошла на i-м сервере, P(A_i) - вероятность выбора i-го сервера, P(B) - вероятность возникновения ошибки в системе.
 *
 * Чтобы вычислить P(B), необходимо использовать формулу полной вероятности:
 *
 * P(B) = сумма(P(B | A_i) * P(A_i)) для всех i от 1 до n
 *
 * Вам нужно вывести вероятность ошибки на каждом сервере, то есть P(A_i | B), для каждого i от 1 до n.
 *
 * Надеюсь, теперь вам понятно, что нужно сделать. Если у вас остались дополнительные вопросы, пожалуйста, сообщите
 */
public class Error {

    /**
     * a1 = 40, b1 = 10
     * a2 = 30, b2 = 5
     * a3 = 30, b3 = 15
     *
     * P(B) = (P(B | A_1) * P(A_1) + P(B | A_2) * P(A_2) + P(B | A_3) * P(A_3))
     *      = (0.10 * 0.40 + 0.05 * 0.30 + 0.15 * 0.30)
     *      = 0.04 + 0.015 + 0.045
     *      = 0.1
     *
     * Теперь мы можем вычислить P(A_i | B) для каждого сервера:
     *
     * P(A_1 | B) = (P(B | A_1) * P(A_1)) / P(B)
     *            = (0.10 * 0.40) / 0.1
     *            = 0.04
     *
     * P(A_2 | B) = (P(B | A_2) * P(A_2)) / P(B)
     *            = (0.05 * 0.30) / 0.1
     *            = 0.015
     *
     * P(A_3 | B) = (P(B | A_3) * P(A_3)) / P(B)
     *            = (0.15 * 0.30) / 0.1
     *            = 0.045
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("#.#########");
        df.setRoundingMode(RoundingMode.HALF_UP);
        int n = Integer.parseInt(reader.readLine());
        double totalErrorProb = 0.0;
        List<Map<Integer, Integer>> servers = new ArrayList<>(n);
        while (n > 0) {
            var line = reader.readLine();
            var arg = line.split(" ");
            Map<Integer, Integer> process = new HashMap<>();
            var a = Integer.parseInt(arg[0]);
            var b = Integer.parseInt(arg[1]);
            process.put(a, b);
            servers.add(process);
//            totalErrorProb += (double) servers[i][0] * servers[i][1] / 100.0;
            totalErrorProb += (double) a * b / 100.0;
            n--;
        }

        for(Map<Integer, Integer> map : servers) {
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                var a = entry.getKey();
                var b = entry.getValue();
                double errorProb = a * b / 100.0 / totalErrorProb;
                System.out.println(df.format(errorProb));
            }
        }
//        System.out.println(servers);

        reader.close();
        writer.close();
    }
}
