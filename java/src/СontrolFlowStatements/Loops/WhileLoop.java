package СontrolFlowStatements.Loops;

import java.util.*;

public class WhileLoop {
    //Цикл while використовується, коли потрібно повторювати блок коду на основі умови,
    // яка перевіряється перед кожною ітерацією.
    public static void main(String[] args) {
        //простий цикл
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        //ArrayList
        List<String> names = new ArrayList<>();
        names.add("Анна");
        names.add("Богдан");
        names.add("Вікторія");
        names.add("Дмитро");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Ім'я: " + name);
        }
        //Map
        Map<String, Integer> population = new HashMap<>();
        population.put("Київ", 2800000);
        population.put("Львів", 721301);
        population.put("Харків", 1441000);
        population.put("Одеса", 993120);
        //Метод entrySet() повертає набір пар ключ-значення,
        //а метод iterator() повертає ітератор для цього набору.
        //Кожен елемент цього набору представлений об'єктом Map.Entry,
        // що містить методи getKey() та getValue(), щоб отримати ключ та значення кожної пари.
        Iterator<Map.Entry<String, Integer>> mapIterator = population.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = mapIterator.next();
            String city = entry.getKey();
            int count = entry.getValue();
            System.out.println("Населення міста " + city + ": " + count);
        }

    }
}
