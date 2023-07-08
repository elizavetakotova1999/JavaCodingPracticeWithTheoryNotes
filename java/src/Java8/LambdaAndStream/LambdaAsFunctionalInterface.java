package Java8.LambdaAndStream;

//Використання лямбда-виразу для реалізації функціонального інтерфейсу:
public class LambdaAsFunctionalInterface {
    public static void main(String[] args) {
        // Використання лямбда-виразу для реалізації методу calculate
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;

        // Виклик методів з лямбда-виразами
        int result1 = add.calculate(5, 3);
        int result2 = subtract.calculate(10, 7);

        System.out.println("Результат додавання: " + result1);
        System.out.println("Результат віднімання: " + result2);
    }

}
