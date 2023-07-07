package СontrolFlowStatements;

public class TernaryOperator {
    /*Тернарний оператор ? дозволяє коротко виразити умовну логіку в одному рядку коду.
     Він має форму: умова ? вираз1 : вираз2.
     Якщо умова виконується, то результатом буде вираз1, в іншому випадку результатом буде вираз2.*/
    public static void main(String[] args) {
        int number = 5;
        String result = (number % 2 == 0) ? "Парне" : "Непарне";
        System.out.println("Число " + number + " є " + result);

        int number1 = 10;
        int number2 = 5;
        int max = (number1 > number2) ? number1 : number2;

        String message = (max % 2 == 0) ? "Найбільше число є парним" : "Найбільше число є непарним";

        System.out.println("Найбільше число: " + max);
        System.out.println(message);
    }
}
