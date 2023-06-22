package СontrolFlowStatements.Loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeachLoop {
    /*
    У Java цикл `foreach` (також відомий як "розширений цикл for" або "for-each цикл")
    використовується для ітерації (перебору) кожного елемента в колекції або масиві даних.
    Він автоматично перебирає всі елементи без необхідності вказувати індекси або
    використовувати додаткові змінні контролю.

    Синтаксис циклу `foreach` виглядає наступним чином:

    for (тип_елементу змінна : колекція_або_масив) {
        // Код, що виконується для кожного елементу
    }*/
    public static void main(String[] args) {

        String[] languages = {"Java", "Python", "C++", "JavaScript"};

        for (String language : languages) {
            System.out.println("Мова програмування: " + language);
        }
        //Колекції
        List<String> names = new ArrayList<>();
        names.add("Анна");
        names.add("Богдан");
        names.add("Вікторія");
        names.add("Дмитро");

        for (String name : names) {
            System.out.println(name);
        }
        //Map
        Map<String, Integer> population = new HashMap<>();
        population.put("Київ", 2800000);
        population.put("Львів", 721301);
        population.put("Харків", 1441000);
        population.put("Одеса", 993120);

        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            String city = entry.getKey();
            int count = entry.getValue();
            System.out.println("Населення міста " + city + ": " + count);
        }

    }

}