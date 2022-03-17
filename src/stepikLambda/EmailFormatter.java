package stepikLambda;

import java.util.Scanner;
import java.util.function.Function;

/**
 * Форматер электронной почты
 * В этом упражнении вам нужно написать функцию, которая форматирует
 * сообщения электронной почты в соответствии с определенным форматом.
 * Этот формат утверждает, что сообщение состоит из четырех частей: электронной почты отправителя,
 * электронной почты получателя, текста и подписи. Все части разделены специальным "|"символом.
 * Чтобы написать форматер, вам нужно использовать лямбда-выражение,
 * которое принимает только text в качестве аргумента и захватывает
 * все остальные переменные (sender, receiver и signature) из контекста.
 *
 * Давайте рассмотрим пример: представьте, что есть входной текст "The new version of Java works pretty fast!".
 * Отправитель есть "sender@mymail.com", получатель есть
 * "receiver@mymail.com"и подпись есть "Best regards, James Gosling".
 * Вот сообщение, созданное в соответствии с описанным форматом:
 *
 * sender@mymail.com|receiver@mymail.com|The new version of Java works pretty fast!|Best regards, James Gosling
 * Обратите внимание, что до и после символов нет лишних пробелов"|".
 *
 * Пример ввода:
 *
 * sender@mymail.com
 * receiver@mymail.com
 * С наилучшими пожеланиями, Джеймс Гослинг
 * Новая версия Java работает довольно быстро!
 * Пример вывода:
 *
 * sender@mymail.com/receiver@mymail.com|Новая версия Java работает довольно быстро!|С наилучшими пожеланиями, Джеймс Гослинг
 */

public class EmailFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       final String sender = scanner.nextLine();
       final String receiver = scanner.nextLine();
       final String signature = scanner.nextLine();

        Function<String, String> emailFormatter = text -> sender + "|" + receiver +"|" + signature + "|" + text;

        System.out.println(emailFormatter.apply(scanner.nextLine()));
    }
}
