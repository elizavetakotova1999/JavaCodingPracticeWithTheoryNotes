package PascalTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        // Додати перший рядок з числом 1
        triangle.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            // Додати перше число 1 в поточний рядок
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                // Обчислити число як суму двох чисел над ним в попередньому рядку
                int sum = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(sum);
            }

            // Додати останнє число 1 в поточний рядок
            currentRow.add(1);

            // Додати поточний рядок до трикутника
            triangle.add(currentRow);
        }

        return triangle;
    }

}


