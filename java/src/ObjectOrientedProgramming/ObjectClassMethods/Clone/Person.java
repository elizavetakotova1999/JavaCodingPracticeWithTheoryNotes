package ObjectOrientedProgramming.ObjectClassMethods.Clone;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
    private String name;
    private List<String> phoneNumbers;

    public Person(String name, List<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        // Створюємо глибоку копію списку контактних номерів
        List<String> clonedPhoneNumbers = new ArrayList<>(phoneNumbers);

        // Створюємо копію об'єкта Person зі скопійованими номерами
        return new Person(name, clonedPhoneNumbers);
    }
}

