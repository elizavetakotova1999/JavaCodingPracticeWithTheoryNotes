package Arrays;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysMethods {
    public static void main(String[] args) {
        int custom[] = {27, 89, 34, -5, 34};
        Integer[] wrapperArray = {2, 1, 234, 6, 2, 5, 26};
        int[] array1d = new int[]{1, -3, 6, 7, 2, 7, 8, 9, -5};
        int[][] array2d = {{1, 3, 2, 6, 7}, {2, 2, 7}, {7, 8, 9}};

        IntUnaryOperator intUnaryOperator = operand -> 4;
        IntBinaryOperator intBinaryOperator = (left, right) -> {
            left = 1;
            right = 4;
            return left + right;
        };
        // Пошук елемента 3 в масиві array1d
        System.out.println("binary search: " + Arrays.binarySearch(array1d, 3));
        // Порівняння масивів array1d і custom
        System.out.println("compare: " + Arrays.compare(array1d, custom));
        // Порівняння масивів array1d і custom (беззнакове порівняння)
        System.out.println("compare unsigned: " + Arrays.compareUnsigned(array1d, custom));
        // Копіювання перших 2 елементів з масиву custom
        System.out.println("copy of : " + Arrays.toString(Arrays.copyOf(custom, 2)));
        // Копіювання елементів з масиву custom у діапазоні від 0 до 3 (не включаючи)
        System.out.println("copy of range: " + (Arrays.toString(Arrays.copyOfRange(custom, 0, 3))));
        // Порівняння масивів custom і array1d
        System.out.println("equals: " + Arrays.equals(custom, array1d));
        // Обчислення хеш-коду масиву custom
        System.out.println("hashcode: " + Arrays.hashCode(custom));
        // Пошук першого відмінного елемента між масивами custom і array1d
        System.out.println("mismatch: " + Arrays.mismatch(custom, array1d));
        // Створення сплітератора для масиву custom
        System.out.println("spliterator: " + Arrays.spliterator(custom));
        // Створення стріму для масиву custom
        System.out.println("stream: " + Arrays.stream(custom));
        // Перетворення масиву custom в список
        System.out.println("as list: " + Arrays.asList(custom));
        // Порівняння вкладених масивів wrapperArray на рівність
        System.out.println("deep equals: " + Arrays.deepEquals(wrapperArray, wrapperArray));
        // Обчислення хеш-коду масиву wrapperArray з урахуванням вкладених елементів
        System.out.println("deep hashcode: " + Arrays.deepHashCode(wrapperArray));
        // Перетворення вкладеного масиву array2d в рядкове представлення
        System.out.println("deep to String: " + Arrays.deepToString(array2d));
        // Перетворення масиву array2d в рядкове представлення
        System.out.println("to String: " + Arrays.toString(array2d));
        // Заповнення масиву custom значенням 7
        Arrays.fill(custom, 7);
        // Паралельне сортування підмасиву масиву custom в діапазоні від 4 (включно) до 5 (не включаючи)
        Arrays.parallelSort(custom, 4, 5);
        // Паралельна ініціалізація масиву custom за допомогою оператора intUnaryOperator
        Arrays.parallelSetAll(custom, intUnaryOperator);
        // Паралельне обчислення префіксних сум в підмасиві масиву custom за допомогою оператора intBinaryOperator
        Arrays.parallelPrefix(custom, 1, 4, intBinaryOperator);
        // Ініціалізація масиву custom за допомогою оператора intUnaryOperator
        Arrays.setAll(custom, intUnaryOperator);
        // Сортування масиву array1d
        Arrays.sort(array1d);
    }
}
