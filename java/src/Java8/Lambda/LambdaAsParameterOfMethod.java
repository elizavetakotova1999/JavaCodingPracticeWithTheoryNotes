package Java8.Lambda;

import java.util.function.Function;

//Передача лямбда-виразу як параметра методу:
public class LambdaAsParameterOfMethod {
    // Метод, який приймає лямбда-вираз в якості параметра
    public static void processString(String str, Function<String, Integer> processor) {
        int length = processor.apply(str);
        System.out.println("Довжина рядка: " + length);
    }

    public static void main(String[] args) {
        String text = "Привіт, світ!";

        // Виклик методу з лямбда-виразом як параметром
        processString(text, s -> s.length());
    }

}
