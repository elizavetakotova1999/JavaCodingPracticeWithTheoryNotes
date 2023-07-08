package Java8.Lambda;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class LambdaExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //1)Використання лямбда-виразу для ітерації по колекції:
        // вивід кожного числа
        System.out.print("Ітерація колекцій:  ");
        numbers.forEach(n -> System.out.print(n+ " "));
        System.out.println();

        //2)Використання лямбда-виразу для фільтрації колекції:
        // фільтрація парних чисел
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Фільтрація колекцій: "+ evenNumbers); // Вивід: [2, 4]

        //3)Використання лямбда-виразу для сортування колекції:
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Mary");
        // сортування колекції за довжиною рядків
        names.sort((name1, name2) -> name1.length() - name2.length());
        System.out.println("Сортування колекцій: "+names); // [Bob, John, Mary, Alice]

        //4)Використання лямбда-виразу для мапування колекції:
        // мапування кожного числа до його квадрата
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Мапування колекцій: "+squaredNumbers); //[1, 4, 9, 16, 25]

        //5)Використання лямбда-виразу для обробки виключень:
        // функціональний інтерфейс, який може обробляти виключення
        System.out.print("Обробка виключень: ");
        Consumer<String> exceptionHandler = message -> {
            try {
                // Код, що може спричинити виняток
                throw new Exception(message);
            } catch (Exception e) {
                // Обробка винятку в лямбда-виразі
                System.out.println("Error - " + e.getMessage());
            }
        };
        // Виклик лямбда-виразу з обробкою винятку
        exceptionHandler.accept("Приклад винятку");

        //6)Використання лямбда-виразу для перевірки умови:
        System.out.print("Перевірка умови: ");
        // Функціональний інтерфейс для перевірки умови на парне число
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.print(isEven.test(4)+", ");  // true
        System.out.print(isEven.test(7));  // false

        //7)Використання лямбда-виразу для обчислення значення:
        Function<Integer, Integer> square = number -> number * number;
        int result = square.apply(5);
        System.out.println("\nОбчислення значень: "+result); // Вивід: 25

        //8)Використання лямбда-виразу для згортання (reduce) колекції:
        int sum = numbers.stream().reduce(0, Integer::sum);//.reduce(0, (a, b) -> a + b);
        System.out.println("Згортання(reduce) колекцій: "+ sum); // Вивід: 15

        //9)Використання лямбда-виразу для перетворення одного типу даних на інший:
        Function<String, Integer> stringToInteger = Integer::parseInt;//.. = s -> Integer.parseInt(s)
        int number = stringToInteger.apply("123");
        System.out.println("Перетворення одного типу даних на інший: "+ number); // Вивід: 123

        //10)Використання лямбда-виразу для перевірки наявності елементу в колекції:
        boolean containsAlice = names.stream().anyMatch(name -> name.equals("Alice"));
        System.out.println("Перевірка наявності елементу в колекції:"+ containsAlice); // Вивід: true

        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Mary", 30)
        );

        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println("Перевірка наявності елементу в колекції: "+peopleByAge); // Вивід: {25=[John, Bob], 30=[Alice, Mary]}

        //11)Використання лямбда-виразу для обробки паралельних потоків даних:
        System.out.println("Обробка паралельних потоків даних: ");
        numbers.parallelStream().forEach(System.out::println);
        int summ = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("сума: "+ summ); // Вивід: 15

    }




}


